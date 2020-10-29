    package com.Ananda.Tugas3.Komposisi;

    public class Anak {//class
        private int idAnak;//tipe data
        private String namaAnak;
        private int umurAnak;
        private String statusAnak;

        //constructor
        public Anak(int idAnak, String namaAnak, int umurAnak, String statusAnak) {
            this.idAnak = idAnak;
            this.namaAnak = namaAnak;
            this.umurAnak = umurAnak;
            this.statusAnak = statusAnak;
        }

        //getter
        public int getIdAnak() {
            return idAnak;
        }

        public String getNamaAnak() {
            return namaAnak;
        }

        public int getUmurAnak() {
            return umurAnak;
        }

        public String getStatusAnak() {
            return statusAnak;
        }
    }
