package com.Ananda.Modul4.Interface;

public class DemoInterface {
    public static void main(String[] args) {
        Paket paket = new Paket("PBO", "Ananda", 90000, "800 mb", 85000);

        paket.hitungHargaPaket();
        paket.cetakPaket();
    }
}