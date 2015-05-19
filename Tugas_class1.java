class Tugas_class1 {
        private String Nama;
        private int Umur;

        public Tugas_class1(String nama, int umur){
            Nama = nama ;
            Umur = umur;
        }

        public void setNama(String nama) {
            Nama = nama;
        }
        public String getNama(){
            return Nama;
        }

        public void setUmur(int umur) {
            Umur = umur;
        }
        public int getUmur(){
            return Umur;

        }
        public void tampilkanBiodata(){
            System.out.println("::: BIODATA :::");
            System.out.println("Nama = " + Nama);
            System.out.println("Umur = " + Umur);

        }
    }

