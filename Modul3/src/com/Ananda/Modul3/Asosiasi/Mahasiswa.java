    package com.Ananda.Modul3.Asosiasi;//library

    public class Mahasiswa {//method
        private int nim;//tipe data
        private  String nama;//tipe data

        //(-) Private
        //(+) Public
        //construtor tanpa parameter
        public Mahasiswa(){
        }

        //constructor
        public Mahasiswa(int nim, String nama) {
            this.nim = nim;
            this.nama = nama;
        }

        //getter
        public int getNim() {
            return nim;
        }

        //setter
        public void setNim(int nim) {
            this.nim = nim;
        }

        //getter
        public String getNama() {
            return nama;
        }

        //setter
        public void setNama(String nama) {
            this.nama = nama;
        }
    }
