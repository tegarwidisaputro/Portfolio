/*  Tegar Widi Saputro
    20081010008 */

    package Vending_Machine;

    public class Maman {
        // Attributes
        private int terjual;
        private int belum_terjual;
        private int keuntungan;

        // Constructor
        public Maman(int terjual, int belum_terjual, int keuntungan) {
            this.terjual = terjual;
            this.belum_terjual = belum_terjual;
            this.keuntungan = keuntungan;
        }

        // Getter
        public int getTerjual() {
            return terjual;
        }
        public int getBelum_terjual() {
            return belum_terjual;
        }
        public int getKeuntungan() {
            return keuntungan;
        }

        // Main
        public static void main(String[] args) {
            Maman maman = new Maman(1, 99, 3000);
            System.out.println("Terjual: " + maman.getTerjual());
            System.out.println("Belum Terjual: " + maman.getBelum_terjual());
            System.out.println("Keuntungan: " + maman.getKeuntungan());
        }
    }