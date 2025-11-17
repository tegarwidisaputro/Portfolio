/*  Tegar Widi Saputro
    20081010008 */

    package Vending_Machine;

    public class Pembeli {
        // Atribut
        private String menu;
        private int item;
        private int jumlah;

        // Konstruktor
        public Pembeli(String menu, int item, int jumlah) {
            this.menu = menu;
            this.item = item;
            this.jumlah = jumlah;
        }

        // Getter
        public String getMenu() {
            return menu;
        }
        public int getItem() {
            return item;
        }
        public int getJumlah() {
            return jumlah;
        }

        // Main
        public static void main(String[] args) {
            System.out.println("Daftar Menu Bakso");
            System.out.println("");

            Harga bakso_halus = new Harga("Bakso Halus", 2000, 3000);
            System.out.println("Bakso Halus "+ bakso_halus.getHargaJual());

            Harga bakso_urat = new Harga("Bakso Urat", 2000, 3500);
            System.out.println("Bakso Urat "+ bakso_urat.getHargaJual());

            Harga bakso_telur_puyuh = new Harga("Bakso Telur Puyuh", 2000, 4000);
            System.out.println("Bakso Telur Puyuh "+ bakso_telur_puyuh.getHargaJual());

            Harga bakwan = new Harga("Bakwan", 1000, 2000);
            System.out.println("Bakwan "+ bakwan.getHargaJual());

            Harga tahu = new Harga("Tahu", 500, 1000);
            System.out.println("Tahu "+ tahu.getHargaJual());

            Harga mie_bihun = new Harga("Mie Bihun", 500, 1000);
            System.out.println("Mie Bihun "+ mie_bihun.getHargaJual());

            Harga kuah = new Harga("Kuah", 0, 0);
            System.out.println("Kuah "+ kuah.getHargaJual());

            // Pembeli
            Pembeli pembeli = new Pembeli("Bakso Halus", 1, 3000);
            System.out.println("");
            System.out.println("Pembeli");
            System.out.println("Menu: "+ pembeli.getMenu());
            System.out.println("Item: "+ pembeli.getItem());
            System.out.println("Jumlah: "+ pembeli.getJumlah());
            System.out.println("");
            
        }
    }