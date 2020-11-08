package com.Ananda.Tugas4.Abstract;

public class CommissionEmployee extends Employee {//class
    //constructor
    public CommissionEmployee(String nama, String nip, float upah, float komisi, float total_penjualan, float total_proyek) {
        super(nama, nip, upah, komisi, total_penjualan, total_proyek);
    }

    //output
    @Override
    public void getGaji() {
        float gaji = this.upah + (this.komisi * this.total_penjualan);
        System.out.println("Total gaji " + this.nama + " adalah " + gaji);
    }
}
