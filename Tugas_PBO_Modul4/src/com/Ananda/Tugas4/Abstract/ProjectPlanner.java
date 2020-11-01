    package com.Ananda.Tugas4.Abstract;

    public class ProjectPlanner extends Employee {//class
        //constructor
        public ProjectPlanner(String nama, String nip, float upah, float komisi, float total_penjualan, float total_proyek) {
            super(nama, nip, upah, komisi,  (float) 0, total_proyek);
        }

        //output
        @Override
        public void getGaji() {
            float pajak = (this.upah * 5) / 100;
            float gaji = this.upah + (this.komisi * this.total_proyek) - pajak;
            System.out.println("Total gaji " + this.nama + " adalah " + gaji);
        }
    }
