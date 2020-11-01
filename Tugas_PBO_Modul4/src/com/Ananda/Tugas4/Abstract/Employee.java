    package com.Ananda.Tugas4.Abstract;

    public abstract class Employee {//class
        protected String nama;//tipe data
        protected String nip;
        protected Float upah;
        protected Float komisi;
        protected Float total_penjualan;
        protected Float total_proyek;

        //constructor
        public Employee(String nama, String nip, Float upah, Float komisi, Float total_penjualan, Float total_proyek) {
            this.nama = nama;
            this.nip = nip;
            this.upah = upah;
            this.komisi = komisi;
            this.total_penjualan = total_penjualan;
            this.total_proyek = total_proyek;
        }

        public abstract void getGaji();
    }
