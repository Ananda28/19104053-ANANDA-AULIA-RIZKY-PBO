    package com.Ananda.Tugas3.Asosisasi;//library

    public class DemoKomplek {//class
        public static void main(String[] args) {
            Komplek anggrek2 = new Komplek("200","Bumi Anggrek");

                Rumah rumah1 = new Rumah("201","Iwan",5);
                Rumah rumah2 = new Rumah("202","Eko",3);
                Rumah rumah3 = new Rumah("203","pur",5);
                Rumah rumah4 = new Rumah("204","Haryono",6);
                Rumah rumah5 = new Rumah("205","Bayu",3);

                anggrek2.addRumah(rumah1.getIdRumah());
                anggrek2.addRumah(rumah2.getIdRumah());
                anggrek2.addRumah(rumah3.getIdRumah());
                anggrek2.addRumah(rumah4.getIdRumah());
                anggrek2.addRumah(rumah5.getIdRumah());
                anggrek2.getDataKomplek();
        }
    }
