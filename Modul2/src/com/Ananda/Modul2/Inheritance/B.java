    package com.Ananda.Modul2.Inheritance;

    //inheritance = menurunkan
    //Extend mewariskan method dan property dari kelas induknya
    public class B extends A {
        public int z;

        public void sumValue(){
            System.out.println("Jumlah\t: " + (x + y + z ));
        }

    }
