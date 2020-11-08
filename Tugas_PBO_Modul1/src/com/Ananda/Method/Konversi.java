    package com.Ananda.Method;//Library

    import java.util.Scanner;

    public class Konversi {//Class
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            // Deklarasi Objek
            Suhu suhu5 = new Suhu();

            // Input Suhu
            System.out.print("Masukan Suhu Dalam Celcius\t: ");
            float suhu = scan.nextFloat();

            // Cetak konversi
            Float suhu1 = suhu5.CelciusFahrenheit(suhu);
            System.out.println("Celcius Ke Fahrenheit\t: " + suhu1);

            // Cetak konversi
            Float suhu2 = suhu5.FahrenheitKelvin(suhu1);
            System.out.println("Fahrenheit Ke Kelvin\t: " + suhu2);

            // Cetak konversi
            Float suhu3 = suhu5.KelvinReamur(suhu2);
            System.out.println("Kelvin Ke Reamur\t\t: " + suhu3);

            // Cetak konversi
            Float suhu4 = suhu5.ReamurCelcius(suhu3);
            System.out.println("Reamur Ke Celcius\t\t: " + suhu4);
        }
    }
