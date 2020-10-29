    package com.Ananda.Modul3.Komposisi;//library

    public class Keyboard {//method
        private String merk;//tipe data
        private String type;

        //Constructor
        public Keyboard(String merk, String type) {
            this.merk = merk;
            this.type = type;
        }

        //ouput
        public void PrintSpec(){
            System.out.println("- Merk\t: " + merk);
            System.out.println("- Type\t: " + type);
            System.out.println();

        }
    }
