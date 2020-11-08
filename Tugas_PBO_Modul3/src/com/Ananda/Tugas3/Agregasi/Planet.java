    package com.Ananda.Tugas3.Agregasi;

    public class Planet {//class
        private int idPlanet;//tipe data
        private int urutanPlanet;
        private String namaPlanet;

        //constructor
        public Planet(int idPlanet, int urutanPlanet, String namaPlanet) {
            this.idPlanet = idPlanet;
            this.urutanPlanet = urutanPlanet;
            this.namaPlanet = namaPlanet;
        }

        //setter
        public void setIdPlanet(int idPlanet) {
            this.idPlanet = idPlanet;
        }

        public void setUrutanPlanet(int urutanPlanet) {
            this.urutanPlanet = urutanPlanet;
        }

        public void setNamaPlanet(String namaPlanet) {
            this.namaPlanet = namaPlanet;
        }

        //getter
        public int getIdPlanet() {
            return idPlanet;
        }

        public int getUrutanPlanet() {
            return urutanPlanet;
        }

        public String getNamaPlanet() {
            return namaPlanet;
        }
    }
