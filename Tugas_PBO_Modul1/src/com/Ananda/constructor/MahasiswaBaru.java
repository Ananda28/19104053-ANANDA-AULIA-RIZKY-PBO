    package com.Ananda.constructor;
    import java.util.Scanner;

    public class MahasiswaBaru {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("=== Pendaftaran Mahasiswa Baru IT Telkom Purwokerto ===");

            // Input
            System.out.print("Masukan Nama Lengkap\t: ");
            String nama = scan.nextLine();

            System.out.print("Masukan TTL\t\t\t\t: ");
            String ttl = scan.nextLine();

            System.out.print("Masukan Alamat\t\t\t: ");
            String alamat = scan.nextLine();

            System.out.print("Masukan Agama\t\t\t: ");
            String agama = scan.nextLine();

            System.out.print("Masukan Jenis Kelamin\t: ");
            String kelamin = scan.nextLine();
            System.out.println();
            // pilihan jurusan
            System.out.println("*** Fakultas Informatika ***");
            System.out.println("1.S1 Software Engineering");
            System.out.println("2.S1 Teknik Informatika");
            System.out.println("3.S1 Sistem Informasi");
            System.out.println("4.S1 Sains Data");
            System.out.println();

            System.out.println("*** Fakultas Teknik Telekomunikasi Dan Elektro  ***");
            System.out.println("5.S1 Teknik Telekomunikasi");
            System.out.println("6.S1 Teknik Elektro");
            System.out.println("7.S1 Biomedis");
            System.out.println("8.D3 Teknik Komunikasi");
            System.out.println();

            System.out.println("*** Fakultas Rekayasa Industri Dan Design ***");
            System.out.println("9.S1 Design Komunikasi Visual");
            System.out.println("10.S1 Teknik Industri");
            System.out.println("11.S1 Sistem Informasi");
            System.out.println();
            System.out.print("Masukan Pilihan Jurusan\t: ");
            String jurusan = scan.nextLine();

            // Input
            System.out.print("Masukan Email\t\t\t: ");
            String email = scan.nextLine();
            System.out.print("Masukan Nomer HP\t\t: ");
            int hp = scan.nextInt();
            System.out.print("Masukan Nilai HASIL UN BAHASA INDONESIA :");
            int nilaibhs = scan.nextInt();
            System.out.print("Masukan Nilai HASIL UN MATEMATIKA  :");
            int nilaimtk = scan.nextInt();
            System.out.print("Masukan Nilai HASIL UN BAHASA INGGRIS : ");
            int nilaiinggris = scan.nextInt();
            int nilai = 0;

            Mahasiswa mahasiswa = new Mahasiswa(nama, ttl, alamat, agama, kelamin, jurusan, email, hp, nilai,
                    nilaiinggris, nilaimtk, nilaibhs); // Deklarasi

            // Output
            System.out.println();
            System.out.println("=== Data Calon Mahasiswa IT Telkom Purwokerto ===");
            System.out.println("Nama\t\t\t : " + mahasiswa.nama);
            System.out.println("TTL\t\t\t\t : " + mahasiswa.ttl);
            System.out.println("Alamat\t\t\t : " + mahasiswa.alamat);
            System.out.println("Agama\t\t\t : " + mahasiswa.agama);
            System.out.println("Jenis Kelamin\t : " + mahasiswa.kelamin);
            System.out.println("Pilihan Jurusan\t : " + mahasiswa.pilJurusan);
            System.out.println("Nomer HP\t\t : " + mahasiswa.hp);
            System.out.println("Email\t\t\t : " + mahasiswa.email);

            nilai = ((nilaiinggris+nilaimtk+nilaibhs)/4);
            System.out.println("Nilai Akhir "+ nilai);

            System.out.println("======================HASIL SELEKSI================");
                if (nilai>=80);

                if(nilai>=80){
                    System.out.println(" Grade = LULUS");
                    System.out.println(" Grade = A");
                }else if(nilai>=55){
                    System.out.println(" Grade = LULUS");
                    System.out.println(" Grade = B");
                }else if(nilai>=50){
                    System.out.println(" Grade = TIDAK LULUS");
                    System.out.println(" Grade = C");
                }else if(nilai>=45){
                    System.out.println(" Grade = TIDAK LULUS");
                    System.out.println(" Grade = D");
                }else {
                    System.out.println(" Grade = TIDAK LULUS");
                    System.out.println(" Grade = E");
                }

            System.out.println("Terima Kasih Telah Melakukan Registrasi");
        }
    }
