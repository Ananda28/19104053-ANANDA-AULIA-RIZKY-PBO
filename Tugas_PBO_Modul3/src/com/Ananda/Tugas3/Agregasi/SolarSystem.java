    package com.Ananda.Tugas3.Agregasi;

    import java.util.ArrayList;
    import java.util.List;

    public class SolarSystem {//class
        private String id;//tipe data
        private String nama;
        private List<Planet> planets = new ArrayList<>();

        //constructor
        public SolarSystem(String id, String nama) {
            this.id = id;
            this.nama = nama;
        }

        //getter
        public int getTotalMember() {
            return getPlanets().size();
        }

        public List<Planet> getPlanets() {
            return planets;
        }

        //setter
        public void setPlanets(List<Planet> planets) {
            this.planets = planets;
        }

        public String getId() {
            return id;
        }

        public String getNama() {
            return nama;
        }

        //output
        public void getData() {
            System.out.println("Nama Solar System :" + getNama());
            System.out.println("Total Planer      :" + getTotalMember());
            System.out.println("Daftar Planet     :");
            for (int i = 0; i < getTotalMember(); i++) {
                System.out.println("Id:" + (i + 1) + ", Nama Planet : "
                        + getPlanets().get(i).getNamaPlanet() + ", Urutan : " + (i + 1));
            }
        }
    }
