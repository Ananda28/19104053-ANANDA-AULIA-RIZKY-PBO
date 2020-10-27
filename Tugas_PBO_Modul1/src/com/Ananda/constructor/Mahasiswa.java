    package com.Ananda.constructor;

    public class Mahasiswa {
        String nama, ttl, alamat, agama, kelamin,pilJurusan, email;
        int hp,nilai =0, nilaiinggris=0, nilaimtk=0,  nilaibhs=0;

        public Mahasiswa(String nama, String ttl, String alamat, String agama, String kelamin, String pilJurusan,
                         String email, int hp, int nilai, int nilaiinggris, int nilaimtk, int nilaibhs) {
            this.nama = nama;
            this.ttl = ttl;
            this.alamat = alamat;
            this.agama = agama;
            this.kelamin = kelamin;
            this.pilJurusan = pilJurusan;
            this.email = email;
            this.hp = hp;
            this.nilai = nilai;
            this.nilaiinggris = nilaiinggris;
            this.nilaimtk = nilaimtk;
            this.nilaibhs = nilaibhs;
        }
    }
