package com.Ananda.Tugas5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputIDPengunjung {//class
        public static void main(String[] args) throws Exception {//method
            // scan jumlah pengunjungnya
            System.out.println("<--- Pelanggan --->");
            System.out.print("Jumlah Pelanggan : ");
            int scan = scanInt();

            //try&catch
            try {
                if (scan <= 10) {
                    // deklarasi array
                    int[] jmlPengunjung = new int[scan];
                    System.out.println("Masukan Data Pengunjung : ");
                    //looping
                    for (int n = 0; n < jmlPengunjung.length; n++) {
                        System.out.print("UID\t " + n + "\t:\t");
                        jmlPengunjung[n] = scanInt();
                        System.out.println("Data Ke-" + n + " : " + jmlPengunjung[n] + "\tTerdaftar!\t");
                    }

                    System.out.println("\nLihat Data Pengunjung");

                    while (true) {
                        System.out.print("Indeks :\t");
                        int scanLihatData = scanInt();
                        if (scanLihatData > jmlPengunjung.length) {
                            throw new Exception("Index " + scanLihatData + " tidak ditemukan");
                        }
                        System.out.println("Data ke-" + scanLihatData + " : " + jmlPengunjung[scanLihatData]);
                        System.out.print("Mau lihat data lagi (y/n) : ");
                        String inginLihatData = scanString();
                        if (inginLihatData.equals("n") || inginLihatData.equals("N")) {
                            break;
                        }
                    }
                } else {
                    throw new Exception("Jumlah pengunjung tidak boleh melebihi 10");
                }
            }catch (InputMismatchException e) {
                System.out.println("Inputkan Angka !!!");
            }catch (Exception e) {
                System.out.println(e);
            }
        }

        //method scanint
        public static int scanInt() {
            Scanner scan = new Scanner(System.in);
            int result = scan.nextInt();
            return (int) result;
        }

        //method scanstring
        public static String scanString() {
            Scanner scan = new Scanner(System.in);
            String result = scan.nextLine();
            return (String) result;
        }
    }

