    package com.Ananda.Inheritance;//library

    public class Ikan extends Binatang {//mewarisi semua fungsi
        public String nama;

        //Deklarasi Constructor dengan parameter
        public Ikan(String nama) {
            this.nama = nama;
        }

        public void getNama() {
            System.out.println("Nama ikannya "+nama);
        }


        public void berenang(){
            System.out.println(nama+ " Sedang Berenang ");
        }
    }
