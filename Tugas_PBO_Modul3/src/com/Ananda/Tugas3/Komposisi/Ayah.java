    package com.Ananda.Tugas3.Komposisi;

    public class Ayah {//class
        private int idAyah;//tipe data
        private String namaAyah;
        private int umurAyah;

        //constructor
        public Ayah(int idAyah, String namaAyah, int umurAyah) {
            this.idAyah = idAyah;
            this.namaAyah = namaAyah;
            this.umurAyah = umurAyah;
        }

        //getter
        public int getIdAyah() {
            return idAyah;
        }

        public String getNamaAyah() {
            return namaAyah;
        }

        public int getUmurAyah() {
            return umurAyah;
        }
    }
