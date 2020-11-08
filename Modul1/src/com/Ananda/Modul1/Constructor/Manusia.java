package com.Ananda.Modul1.Constructor;

public class Manusia {
    private String nama;
    private int umur;

    //costructor 1 - tanpa paramater
    public Manusia(){}

    //constructor 2
    public Manusia(String nama) {
        this.nama = nama;
    }

    //constructor 3
    public Manusia(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    //method
    public String getNama(){
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public int getUmur() {
        return umur;
    }
    public void setUmur(int umur) {
        this.umur = umur;
    }
}
