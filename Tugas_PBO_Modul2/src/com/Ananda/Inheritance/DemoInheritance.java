    package com.Ananda.Inheritance;//library

    public class DemoInheritance {//class
        public static void main(String[] args) {//method

            Ikan ikanku = new Ikan("koi");
            Burung burungku = new Burung("bluee");
            Kucing kucingku = new Kucing("kitty");

            //Output
            System.out.println("\nIkan");
            ikanku.getNama();
            ikanku.berenang();
            ikanku.makan(ikanku.nama);
            ikanku.tidur(ikanku.nama);

            System.out.println("\nBurung");
            burungku.getNama();
            burungku.terbang();
            burungku.makan(burungku.nama);
            burungku.tidur(burungku.nama);

            System.out.println("\nKucing");
            kucingku.getNama();
            kucingku.meong();
            kucingku.makan(kucingku.nama);
            kucingku.tidur(kucingku.nama);


        }
    }
