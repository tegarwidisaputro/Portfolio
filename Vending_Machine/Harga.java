/*  Tegar Widi Saputro
    20081010008 */
    
    package Vending_Machine;

    // Class Harga
    public class Harga {
        // Atribut
        private String item;
        private int harga;
        private int harga_jual;

        // Konstruktor
        public Harga(String item, int harga, int harga_jual) {
            this.item = item;
            this.harga = harga;
            this.harga_jual = harga_jual;
        }

        // Getter
        public String getItem() {
            return item;
        }
        public int getHarga() {
            return harga;
        }
        public int getHargaJual() {
            return harga_jual;
        }

        // Setter
        public String toString() {
            return "Item: " + item + " Harga: " + harga + " Harga Jual: " + harga_jual;
        }

        // Main
        public static void main(String[] args) {
            // Object
            Harga [] harga = new Harga[100];
            Harga bakso_halus = new Harga("Bakso_Halus", 2000, 3000);
            Harga bakso_urat = new Harga("Bakso_Urat", 2000, 3500);
            Harga bakso_telur_puyuh = new Harga("Bakso_Telur_Puyuh", 2000, 4000);
            Harga bakwan = new Harga("Bakwan", 1000, 2000);
            Harga tahu = new Harga("Tahu", 500, 1000);
            Harga mie_bihun = new Harga("Mie_Bihun", 500, 1000);
            Harga kuah = new Harga("Kuah", 0, 0);

            // Loop
            for (int i = 0; i < 100; i++) {
                harga[i] = bakso_halus;
                System.out.println(harga[i]);
            }
            for (int i = 0; i < 100; i++) {
                harga[i] = bakso_urat;
                System.out.println(harga[i]);
            }
            for (int i = 0; i < 100; i++) {
                harga[i] = bakso_telur_puyuh;
                System.out.println(harga[i]);
            }
            for (int i = 0; i < 100; i++) {
                harga[i] = bakwan;
                System.out.println(harga[i]);
            }
            for (int i = 0; i < 100; i++) {
                harga[i] = tahu;
                System.out.println(harga[i]);
            }
            for (int i = 0; i < 100; i++) {
                harga[i] = mie_bihun;
                System.out.println(harga[i]);
            }
            for (int i = 0; i < 0; i++) {
                harga[i] = kuah;
                System.out.println(harga[i]);
            }
        }
    }