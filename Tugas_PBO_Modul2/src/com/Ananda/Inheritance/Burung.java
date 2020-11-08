    package com.Ananda.Inheritance;

    public class Burung extends Binatang {//mewarisi semua fungsi
        public String nama;

        //Deklarasi Constructor dengan parameter
        public Burung(String nama) {
            this.nama = nama;
        }

        public void getNama() {
            System.out.println("Nama burungnya " +nama);
        }

        public void terbang (){
            System.out.println(nama+ " Sedang terbang ");
        }
    }
