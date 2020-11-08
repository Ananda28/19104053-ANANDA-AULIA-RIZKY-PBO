    package com.Ananda.Modul2.Polimorfisme;

    public class Lagu {
        public String judul;
        public String pecncipta;

        //Overloading
        public Lagu(String judul) {
            this.judul = judul;
        }

        //Overloading
        public Lagu(String judul, String pecncipta) {
            this.judul = judul;
            this.pecncipta = pecncipta;
        }

        //void = ngeprint
        public  void getDataLagu(){
            System.out.println("Judul\t\t: " + judul );
            System.out.println("Pencipta\t: " + pecncipta);
            System.out.println();
        }
    }
