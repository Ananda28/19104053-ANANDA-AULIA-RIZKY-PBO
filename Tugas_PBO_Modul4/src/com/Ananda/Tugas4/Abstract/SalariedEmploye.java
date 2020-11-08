    package com.Ananda.Tugas4.Abstract;

    public class SalariedEmploye extends Employee {
        //constructor
        public SalariedEmploye(String nama, String nip, float upah, float komisi, float total_penjualan,
                               float total_proyek){
            super(nama, nip, upah, (float) 0, (float) 0, (float) 0);
        }

        //output
        @Override
        public void getGaji() {
            System.out.println("Total gaji " + this.nama + " adalah " + this.upah);
        }
    }
