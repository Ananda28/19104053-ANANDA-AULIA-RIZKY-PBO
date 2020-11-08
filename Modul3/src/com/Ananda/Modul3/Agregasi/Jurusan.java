    package com.Ananda.Modul3.Agregasi;//library

    import java.util.ArrayList;
    import java.util.List;

    public class Jurusan {//class
        private String kodeJurusan;//tipe data
        private String namaJurusan;
        private List<Mahasiswa> mahasiswaList = new ArrayList<>();//arraylist

        //constructor
        public Jurusan(String kodeJurusan, String namaJurusan) {
            this.kodeJurusan = kodeJurusan;
            this.namaJurusan = namaJurusan;
        }

        //getter
        public String getKodeJurusan() {
            return kodeJurusan;
        }

        //setter
        public void setKodeJurusan(String kodeJurusan) {
            this.kodeJurusan = kodeJurusan;
        }

        //getter
        public String getNamaJurusan() {
            return namaJurusan;
        }

        //setter
        public void setNamaJurusan(String namaJurusan) {
            this.namaJurusan = namaJurusan;
        }

        public List<Mahasiswa> getMahasiswaList() {
            return mahasiswaList;
        }

        public void setMahasiswaList(List<Mahasiswa> mahasiswaList) {
            this.mahasiswaList = mahasiswaList;
        }

        public void addMahasiswa(Mahasiswa mahasiswa){
            mahasiswaList.add(mahasiswa);
        }

        //output
        public void printDataJurusan(){
            System.out.println("Nama Jurusan\t: " + getNamaJurusan());
            System.out.println("Kode Jurusan\t: " + getKodeJurusan());
            System.out.println("List Mahasiswa\t: ");
            for (Mahasiswa mahasiswa : mahasiswaList){
                System.out.println("- Nama\t: " + mahasiswa.getNama()+
                        "\t- Nim\t:" + mahasiswa.getNim());
            }
        }
    }
