    package com.Ananda.Modul1.Object;// Library

    //Class main / Demo Class
    public class Objek {
        public static void main(String[] args) { //Method

            //Deklarasi object tanpa parameter
            Mahasiswa mahasiswaTanpa = new Mahasiswa();

            mahasiswaTanpa.setNama("Ananda");// set = memanggil ke kelas mahasiswa
            mahasiswaTanpa.setNim(19104053);

            System.out.println("Mahasiswa 1");
            System.out.println("Nama\t: " + mahasiswaTanpa.getNama());
            System.out.println("Nim\t\t: " + mahasiswaTanpa.getNim());

            //Deklarasi object dengan 1 parameter
            Mahasiswa mahasiswa1Param = new Mahasiswa("Lisa");

            System.out.println("Mahasiswa 2");
            System.out.println("Nama\t: " + mahasiswa1Param.getNama());
            System.out.println("Nim\t\t: " + mahasiswa1Param.getNim());

            //Deklarasi object dengan parameter
            Mahasiswa mahasiswa = new Mahasiswa( "Paimon",889765);

            System.out.println("Mahasiswa 3");
            System.out.println("Nama\t: " + mahasiswa.getNama());
            System.out.println("Nim\t\t: " + mahasiswa.getNim());
        }
    }
