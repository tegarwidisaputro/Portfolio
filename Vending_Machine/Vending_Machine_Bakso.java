/*  Tegar Widi Saputro
    20081010008 */

    package Vending_Machine;

    import java.util.Scanner;

    public class Vending_Machine_Bakso {
        // Main
        public static void main(String[] args) {

            // Daftar Menu Bakso
            System.out.println("Daftar Menu Bakso");
            System.out.println("1. Bakso Halus: 3000");
            System.out.println("2. Bakso Urat: 3500");
            System.out.println("3. Bakso Telur Puyuh: 4000");
            System.out.println("4. Bakwan: 2000");
            System.out.println("5. Tahu: 1000");
            System.out.println("6. Mie Bihun: 1000");
            System.out.println("7. Kuah: Gratis");
            System.out.println("");

            // Input
            Scanner input = new Scanner(System.in);
            System.out.print("Input Nomor Pesanan: ");
            int pilihan = input.nextInt();
            switch (pilihan) {
                case 1:
                    System.out.println("Anda memilih Bakso Halus");
                    System.out.println("Harga: 3000");
                    break;
                case 2:
                    System.out.println("Anda memilih Bakso Urat");
                    System.out.println("Harga: 3500");
                    break;
                case 3:
                    System.out.println("Anda memilih Bakso Telur Puyuh");
                    System.out.println("Harga: 4000");
                    break;
                case 4:
                    System.out.println("Anda memilih Bakwan");
                    System.out.println("Harga: 2000");
                    break;
                case 5:
                    System.out.println("Anda memilih Tahu");
                    System.out.println("Harga: 1000");
                    break;
                case 6:
                    System.out.println("Anda memilih Mie Bihun");
                    System.out.println("Harga: 1000");
                    break;
                case 7:
                    System.out.println("Anda memilih Kuah");
                    System.out.println("Harga: Gratis");
                    break;
                default:
                    System.out.println("Anda memilih menu yang salah");
                    break;
            }

            // Output
            System.out.println("");
            System.out.println("Terima kasih telah berbelanja di Vending Machine");

            // Informasi Maman
            System.out.println("");
            System.out.println("Informasi Kang Maman");
            Scanner maman = new Scanner(System.in);
            System.out.print("Input Nomor Informasi: ");
            int Informasi = maman.nextInt();
            switch (Informasi) {
                case 1:
                    System.out.println("Bakso Halus Terjual: 1");
                    System.out.println("Bakso Halus Sisa: 99");
                    System.out.println("Total Keuntungan: 3000");
                    break;
                case 2:
                    System.out.println("Bakso Urat Terjual: 1");
                    System.out.println("Bakso Urat Sisa: 99");
                    System.out.println("Total Keuntungan: 3500");
                    break;
                case 3:
                    System.out.println("Bakso Telur Puyuh Terjual: 1");
                    System.out.println("Bakso Telur Puyuh Sisa: 99");
                    System.out.println("Total Keuntungan: 4000");
                    break;
                case 4:
                    System.out.println("Bakwan Terjual: 1");
                    System.out.println("Bakwan Sisa: 99");
                    System.out.println("Total Keuntungan: 2000");
                    break;
                case 5:
                    System.out.println("Tahu Terjual: 1");
                    System.out.println("Tahu Sisa: 99");
                    System.out.println("Total Keuntungan: 1000");
                    break;
                case 6:
                    System.out.println("Mie Bihun Terjual: 1");
                    System.out.println("Mie Bihun Sisa: 99");
                    System.out.println("Total Keuntungan: 1000");
                    break;
                case 7:
                    System.out.println("Kuah Gratis");
                    break;
                default:
                    System.out.println("Stok Habis");
                    break;
            }
        }
    }