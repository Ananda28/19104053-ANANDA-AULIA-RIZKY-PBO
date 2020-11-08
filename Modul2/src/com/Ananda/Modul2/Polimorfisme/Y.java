    package com.Ananda.Modul2.Polimorfisme;

    //x masuk ke subclass
    public class Y extends X{
        @Override
        public void getValue(String value) {
            super.getValue(value);
            System.out.println("value kelas Y : " + value);
        }
    }
