    package com.Ananda.Vmi;//library

    public class Mahasiswa {//class
        public String nama;
        public String status;
        public int semester;

        //constructor
        public Mahasiswa(String nama, String status, int semester) {
            this.nama = nama;
            this.status = status;
            this.semester = semester;
        }

        //getter
        public String getStatus() {
            return status;
        }
    }
