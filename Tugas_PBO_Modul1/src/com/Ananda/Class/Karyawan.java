package com.Ananda.Class;//Library

public class Karyawan {//Class
    private static String nama = "Ananda Aulia";
    private static String ttl = "Gisting, 28 Maret 1998";
    private static String alamat = "Jln. Anggrek V Bekasi";
    private static String kelamin = "Perempuan";
    private static String status = "Belum Kawin";
    private static String riwayat= "S1 Software Engineering";
    private static String email = "ananda@gmail.com";
    private static String nomer = "08128594839";
    private static int  SetNik() {
        int nik = 19104053;
        return nik;
    }
    //Method
    public static void main(String[] args) {
        System.out.println("==========DATA KARYAWAN==========");
        System.out.println("Nama Karyawan\t\t : " + nama);
        System.out.println("Nik Karyawan\t\t : " + SetNik());
        System.out.println("TTL\t\t\t\t\t : " + ttl);
        System.out.println("Alamat Karyawan\t\t : " + alamat);
        System.out.println("Jenis Kelamin\t\t : " + kelamin);
        System.out.println("Status Pernikahan\t : " + status);
        System.out.println("Pendidikan Terakhir\t : " + riwayat);
        System.out.println("Email\t\t\t\t : " + email);
        System.out.println("Nomer HP\t\t\t : " + nomer);
    }
}
