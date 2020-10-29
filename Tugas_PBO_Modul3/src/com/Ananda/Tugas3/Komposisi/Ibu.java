    package com.Ananda.Tugas3.Komposisi;

    public class Ibu {//class
        private int idIbu;//tipe data
        private String namaIbu;
        private int umurIbu;

        //constructor
        public Ibu(int idIbu, String namaIbu, int umurIbu) {
            this.idIbu = idIbu;
            this.namaIbu = namaIbu;
            this.umurIbu = umurIbu;
        }

        //getter
        public int getIdIbu() {
            return idIbu;
        }

        public String getNamaIbu() {
            return namaIbu;
        }

        public int getUmurIbu() {
            return umurIbu;
        }
    }
