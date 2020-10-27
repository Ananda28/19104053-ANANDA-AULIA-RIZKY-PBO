    package com.Ananda.OverLoading;//library

    public class DemoClub {//class
        public static void main(String[] args) {//method
            //constuctor
            Club club = new Club();
            Club club1 = new Club("Real Madrid C.F.");
            Club club2 = new Club("Liverpool F.C." , "pemenang ucl tahun lalu");
            Club club3 = new Club("Real Madrid C.F.",1902 ,"Santiago Bernabéu");
            Club club4 = new Club("Liverpool F.C." ,1892 ,"Anfield",6,"pemenang ucl tahun lalu");

            //output
            System.out.println("Club \t\t");
            club.getTeam();
            System.out.println("Club 1\t");
            club1.getTeam();
            System.out.println("Club 2\t");
            club2.getTeam();
            System.out.println("Club 3\t");
            club3.getTeam();
            System.out.println("Club 4\t");
            club4.getTeam();
        }
    }
