    package com.Ananda.Inheritance;//library

    public class Kucing extends Binatang {//mewarisi semua fungsi
        public String nama;

        //Deklarasi Constructor dengan parameter
        public Kucing(String nama) {
            this.nama = nama;
        }

        public void getNama() {
            System.out.println("Nama kucingnya "+nama);
        }

        public void meong(){
            System.out.println(nama+ " Miauwww ");
        }
    }
