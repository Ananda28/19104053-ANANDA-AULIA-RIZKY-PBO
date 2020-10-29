    package com.Ananda.Modul3.Asosiasi;//library

    public class Dosen {//method
        private String kodeDosen;//Tipe data
        private int nimMHS[] = new int[10];
        private int jmlMahasiswa;

        //Constructor
        public Dosen(){
        }

        //Getter
        public String getKodeDosen() {
            return kodeDosen;
        }

        //Setter
        public void setKodeDosen(String kodeDosen) {
            this.kodeDosen = kodeDosen;
        }

        //Getter
        public int getJmlMahasiswa() {
            return jmlMahasiswa;
        }

        //Setter
        public void setJmlMahasiswa(int jmlMahasiswa) {
            this.jmlMahasiswa = jmlMahasiswa;
        }

        public int getNimMhs(int indeks){
            return (nimMHS[indeks]);//fungsional
        }

        public void setNimMHS(int nim){
            nimMHS[jmlMahasiswa] = nim;
            jmlMahasiswa++;
        }
    }
