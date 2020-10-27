package com.Ananda.Modul1.Constructor;

public class DemoManusia {
    public static void main(String[] args) {
        Manusia arrayManusia[] = new Manusia[3];

        Manusia manusia1 = new Manusia();
        manusia1.setNama("aulia");
        manusia1.setUmur(19);

        Manusia manusia2 = new Manusia("ananda");
        Manusia manusia3 = new Manusia("nanda",20);

        arrayManusia[0] = manusia1;
        arrayManusia[1] = manusia2;
        arrayManusia[2] = manusia3;

        for (Manusia x : arrayManusia){
            System.out.println("Character ");
            System.out.println("Nama\t: " + x.getNama());
            System.out.println("Umur\t: " + x.getUmur());
        }
    }
}
