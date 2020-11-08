    package com.Ananda.Modul3.Komposisi;//library

    public class Monitor {//class
        private String merk;//tipe data
        private String size;
        private String refreshRate;

        //Constructor
        public Monitor(String merk, String size, String refreshRate) {
            this.merk = merk;
            this.size = size;
            this.refreshRate = refreshRate;
        }

        //Output
        public void PrintSpec(){
            System.out.println("- Merk\t\t: " + merk);
            System.out.println("- Size\t\t: " + size);
            System.out.println("- Refresh Rate\t\t: " + refreshRate + " Hz");
        }
    }
