    package com.Ananda.Modul3.Agregasi;

    import java.util.ArrayList;
    import java.util.List;

    public class DemoJurusan {
        public static void main(String[] args) {
            Jurusan jurusan = new Jurusan("2110", "Software Engineering");

            Mahasiswa mahasiswa1 = new Mahasiswa("Paimon",21104001);
            Mahasiswa mahasiswa2 = new Mahasiswa("Tabi Bito",21104002);
            Mahasiswa mahasiswa3 = new Mahasiswa("Barbara",21104003);

            //List Mahasiswa dari Class Demo
            List<Mahasiswa> mahasiswaList = new ArrayList<>();
            mahasiswaList.add(mahasiswa1);
            mahasiswaList.add(mahasiswa2);
            mahasiswaList.add(new Mahasiswa("fischl",21104004));

            //Untuk copas data dari list mahasiswa class "demoJurusan" ke class "Jurusan"
            jurusan.setMahasiswaList(mahasiswaList);

            //untuk massukan data Mahasiswa langsung ke class Jurusan
            jurusan.addMahasiswa(mahasiswa3);

            jurusan.printDataJurusan();



        }

    }
