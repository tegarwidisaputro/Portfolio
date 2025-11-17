-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 27, 2022 at 03:09 PM
-- Server version: 10.4.21-MariaDB
-- PHP Version: 8.0.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `kasir_app`
--

-- --------------------------------------------------------

--
-- Table structure for table `tb_barang`
--

CREATE TABLE `tb_barang` (
  `id_barang` int(11) NOT NULL,
  `nama_barang` varchar(50) NOT NULL,
  `stok_barang` int(11) NOT NULL,
  `harga_barang` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tb_barang`
--

INSERT INTO `tb_barang` (`id_barang`, `nama_barang`, `stok_barang`, `harga_barang`) VALUES
(1001, 'Susu Ultramilk', 49, 6000),
(1002, 'Teh Gelas', 48, 2000),
(1003, 'Teh Pucuk', 50, 3000),
(1004, 'Kopi Kenangan', 30, 9000),
(1005, 'Fruit Tea', 50, 6500),
(1006, 'Le Mineral', 50, 5000),
(2001, 'Wafer Coklat', 29, 14000),
(2003, 'Tanggo Coklat', 30, 13000),
(2004, 'Chitato', 28, 12000),
(2005, 'Po Ta Bee', 30, 11000),
(2006, 'Pocky', 30, 12000);

-- --------------------------------------------------------

--
-- Table structure for table `tb_bm`
--

CREATE TABLE `tb_bm` (
  `id_bm` int(11) NOT NULL,
  `id_barang` int(11) NOT NULL,
  `jumlah` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tb_bm`
--

INSERT INTO `tb_bm` (`id_bm`, `id_barang`, `jumlah`) VALUES
(992, 1003, 20),
(993, 1002, 10),
(994, 1001, 6),
(995, 1001, 1),
(996, 1001, 10),
(997, 1002, 12),
(998, 1005, 20);

--
-- Triggers `tb_bm`
--
DELIMITER $$
CREATE TRIGGER `tambah_stok` AFTER INSERT ON `tb_bm` FOR EACH ROW BEGIN
	UPDATE tb_barang SET stok_barang = stok_barang + NEW.jumlah WHERE id_barang = NEW.id_barang;
END
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Table structure for table `tb_transaksi`
--

CREATE TABLE `tb_transaksi` (
  `id_transaksi` int(11) NOT NULL,
  `id_barang` int(11) NOT NULL,
  `nama_barang` varchar(50) NOT NULL,
  `harga` int(11) NOT NULL,
  `jumlah_beli` int(11) NOT NULL,
  `sub_total` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tb_transaksi`
--

INSERT INTO `tb_transaksi` (`id_transaksi`, `id_barang`, `nama_barang`, `harga`, `jumlah_beli`, `sub_total`) VALUES
(881, 1001, 'Susu Ultramilk', 6000, 1, 6000),
(882, 1001, 'Susu Ultramilk', 6000, 2, 12),
(883, 1001, 'Susu Ultramilk', 6000, 3, 18),
(884, 1001, 'Susu Ultramilk', 6000, 2, 12),
(885, 1002, 'Teh Gelas', 2000, 2, 4),
(886, 1001, 'Susu Ultramilk', 6000, 2, 12000),
(887, 2001, 'Wafer Coklat', 14000, 1, 14000),
(888, 1001, 'Susu Ultramilk', 6000, 2, 12000),
(889, 1001, 'Susu Ultramilk', 6000, 5, 30000),
(890, 2004, 'Chitato', 12000, 2, 24000),
(891, 1001, 'Susu Ultramilk', 6000, 1, 6000),
(892, 1002, 'Teh Gelas', 2000, 2, 4000);

--
-- Triggers `tb_transaksi`
--
DELIMITER $$
CREATE TRIGGER `kurangi_stok` AFTER INSERT ON `tb_transaksi` FOR EACH ROW BEGIN
	UPDATE tb_barang SET stok_barang = stok_barang - NEW.jumlah_beli WHERE id_barang = NEW.id_barang;
END
$$
DELIMITER ;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tb_barang`
--
ALTER TABLE `tb_barang`
  ADD PRIMARY KEY (`id_barang`);

--
-- Indexes for table `tb_bm`
--
ALTER TABLE `tb_bm`
  ADD PRIMARY KEY (`id_bm`),
  ADD KEY `id_barang` (`id_barang`);

--
-- Indexes for table `tb_transaksi`
--
ALTER TABLE `tb_transaksi`
  ADD PRIMARY KEY (`id_transaksi`),
  ADD KEY `id_barang` (`id_barang`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tb_bm`
--
ALTER TABLE `tb_bm`
  MODIFY `id_bm` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=999;

--
-- AUTO_INCREMENT for table `tb_transaksi`
--
ALTER TABLE `tb_transaksi`
  MODIFY `id_transaksi` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=893;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `tb_bm`
--
ALTER TABLE `tb_bm`
  ADD CONSTRAINT `tb_bm_ibfk_1` FOREIGN KEY (`id_barang`) REFERENCES `tb_barang` (`id_barang`);

--
-- Constraints for table `tb_transaksi`
--
ALTER TABLE `tb_transaksi`
  ADD CONSTRAINT `tb_transaksi_ibfk_1` FOREIGN KEY (`id_barang`) REFERENCES `tb_barang` (`id_barang`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
