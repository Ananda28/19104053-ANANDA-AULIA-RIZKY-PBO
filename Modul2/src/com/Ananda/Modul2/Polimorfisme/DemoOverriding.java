    package com.Ananda.Modul2.Polimorfisme;

    public class DemoOverriding {
        public static void main(String[] args) {
            X supperClass = new X();
            Y subClass = new Y();

            //method
            supperClass.getValue("Mati Listrik");
            subClass.getValue("Mati Lampu");
        }
    }
