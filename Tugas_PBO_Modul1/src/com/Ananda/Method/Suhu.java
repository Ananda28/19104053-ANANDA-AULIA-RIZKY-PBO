    package com.Ananda.Method;//Library

    public class Suhu {//Class
        // Method
        public float CelciusFahrenheit(float suhu){
            float hasil = (suhu * 9/5) + 32;
            return hasil;
        }
        // Method
        public float FahrenheitKelvin(float suhu) {
            float hasil = (suhu - 32) * 5/9 + 273;
            return hasil;
        }
        // Method
        public float KelvinReamur(float suhu) {
            float hasil = (suhu - 273) * 4/5;
            return hasil;
        }
        // Method
        public float ReamurCelcius(float suhu) {
            float hasil = suhu * 5/4;
            return hasil;
        }
    }
