    package com.Ananda.Modul1.Object;

    public class Mahasiswa {
        String nama;
        int nim;

        //constructor 1 //alt+insert
        public Mahasiswa(){}//tanpa parameter

        //constructor 2
        public Mahasiswa(String nama) {
            this.nama = nama;
        }

        //constructo 3
        public Mahasiswa(String nama, int nim) {//dengan parameter
            this.nama = nama;
            this.nim = nim;
        }

        //Getter & Setter /memanipulasi
        public String getNama() {//fungsi
            return nama;//nama ada di method
        }

        public void setNama(String nama) {//prosedur
            this.nama = nama;//nama ada di parameter
                             //this merujuk ke class itu sendiri,
            //                  dan class itu sendiri itu mahasiswa
        }

        public int getNim() {
            return nim;
        }

        public void setNim(int nim) {
            this.nim = nim;
        }
    }
