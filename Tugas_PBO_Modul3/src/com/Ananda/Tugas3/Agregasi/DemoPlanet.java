    package com.Ananda.Tugas3.Agregasi;

    import java.util.ArrayList;
    import java.util.List;

    public class DemoPlanet {//class
        public static void main(String[] args) {//method
            List<Planet> planets = new ArrayList<>();
            SolarSystem bimasakti = new SolarSystem("007","Bima Sakti");
            planets.add(new Planet(0, 1, "Merkurius"));
            planets.add(new Planet(1, 2, "Venus"));
            planets.add(new Planet(2, 3, "Bumi"));
            planets.add(new Planet(3, 4, "Mars"));
            planets.add(new Planet(4, 5, "Jupiter"));
            planets.add(new Planet(5, 6, "Saturnus"));
            planets.add(new Planet(6, 7, "Uranus"));
            planets.add(new Planet(7, 8, "Neptunus"));

            bimasakti.setPlanets(planets);
            bimasakti.getData();
        }
    }
