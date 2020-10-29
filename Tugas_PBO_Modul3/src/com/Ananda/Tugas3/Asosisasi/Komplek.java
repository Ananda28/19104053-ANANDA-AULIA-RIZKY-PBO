    package com.Ananda.Tugas3.Asosisasi;//library

    import java.util.ArrayList;
    import java.util.List;

    public class Komplek {//class
        private String idKomplek;//tipe data
        private String namaKomplek;
        private int jmlRumah = 0;
        private List<String >idRumah = new ArrayList<>();

        //constructor

        public Komplek(String idKomplek, String namaKomplek) {
            this.idKomplek = idKomplek;
            this.namaKomplek = namaKomplek;
        }

        public void addRumah(String idRumah){
            this.idRumah.add(idRumah);
            jmlRumah = this.idRumah.size();
        }

        //getter & setter
        public String getIdKomplek() {
            return idKomplek;
        }

        public void setIdKomplek(String idKomplek) {
            this.idKomplek = idKomplek;
        }

        public String getNamaKomplek() {
            return namaKomplek;
        }

        public void setNamaKomplek(String namaKomplek) {
            this.namaKomplek = namaKomplek;
        }

        public int getJmlRumah() {
            return jmlRumah;
        }

        public void setJmlRumah(int jmlRumah) {
            this.jmlRumah = jmlRumah;
        }

        public List<String> getIdRumah(){
            return idRumah;
        }

        public void setIdRumah(List<String> idRumah){
            this.idRumah = idRumah;
        }

        //output
        void getDataKomplek(){
            System.out.println("Nama Komplek : " + getNamaKomplek());
            System.out.println("Id Komplek   : " + getIdKomplek());
            System.out.println("Jumlah Rumah : " + getJmlRumah());
            System.out.println("Daftar Nomor Rumah : ") ;
            for(int i = 0; i < getJmlRumah(); i++){
                System.out.println((i + 1) + ". " + getIdRumah().get(i));
            }
        }
    }
