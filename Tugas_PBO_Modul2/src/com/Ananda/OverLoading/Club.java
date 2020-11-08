    package com.Ananda.OverLoading;//library

    public class Club {//class
        private String nama ;
        private int tahunBerdiri ;
        private String stadion ;
        private int juaraUcl ;
        private String deskripsi;

        //Constructor pertama
        public Club(){}

        //Constructor kedua
        public Club(String nama){
            this.nama = nama;
        }

        //Constructor ketiga
        public Club(String nama, String deskripsi){
            this.nama = nama;
            this.deskripsi = deskripsi;
        }

        //Constructor keempat
        public Club(String nama, int tahunBerdiri, String stadion){
            this.nama = nama;
            this.tahunBerdiri = tahunBerdiri;
            this.stadion = stadion;
        }

        //Constructor kelima
        public Club(String nama, int tahunBerdiri, String stadion, int juaraUcl, String deskripsi){
            this.nama = nama;
            this.tahunBerdiri = tahunBerdiri;
            this.stadion = stadion;
            this.juaraUcl = juaraUcl;
            this.deskripsi = deskripsi;
        }

        public void getTeam(){
            System.out.println("Nama\t\t\t: " + nama);
            System.out.println("Tahun Berdiri\t: " + tahunBerdiri);
            System.out.println("Stadion\t\t\t: " + stadion);
            System.out.println("Juara UCL\t\t: " + juaraUcl);
            System.out.println("Deskripsi\t\t: " + deskripsi);
            System.out.println("\n================================\n");
        }
    }
