    package com.Ananda.Tugas3.Asosisasi;//Library

    public class Rumah {//class
        private String idRumah;//tipe data
        private String pemilikRumah;
        private int jumlahOrang;

        //constructor
        public Rumah(String idRumah, String pemilikRumah, int jumlahOrang) {
            this.idRumah = idRumah;
            this.pemilikRumah = pemilikRumah;
            this.jumlahOrang = jumlahOrang;
        }

        //getter
        public String getIdRumah() {
            return idRumah;
        }

        public String getPemilikRumah() {
            return pemilikRumah;
        }

        public int getJumlahOrang() {
            return jumlahOrang;
        }
    }
