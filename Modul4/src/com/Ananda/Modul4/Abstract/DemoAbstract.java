    package com.Ananda.Modul4.Abstract;

    import java.util.Random;

    public class DemoAbstract {
        public static void main(String[] args) {
            Binatang[] binatangs = {
                    new Burung("Beo"),
                    new Kucing("Persia"),
                    new Anjing("Cihuahua")
            };
            Binatang kesayangan;
            Random random = new Random();

            kesayangan = binatangs[random.nextInt(binatangs.length)];

            System.out.println("Binatang Kesayangan\t: " + kesayangan);
            System.out.println("Suaranya\t: ");
            kesayangan.suara();
        }
    }
