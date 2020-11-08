package com.Ananda.Modul2.Polimorfisme;

public class DemoOverloading {
    public static void main(String[] args) {
        Lagu lagu1 = new Lagu("Yoru ni kakeru");
        Lagu lagu2 = new Lagu("Halu","feby");

        lagu1.getDataLagu();
        lagu2.getDataLagu();
    }
}
