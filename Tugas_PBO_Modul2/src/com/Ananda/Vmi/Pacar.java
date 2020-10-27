    package com.Ananda.Vmi;//library

    public class Pacar extends Mahasiswa{////mewarisi semua fungsi
        public String namaPacar,lamaHubungan;

        //Constructor
        public Pacar(String nama, String status, int semester, String namaPacar,String lamaHubungan) {
            super(nama, status, semester);
            this.namaPacar = namaPacar;
            this.lamaHubungan = lamaHubungan;
        }
    }
