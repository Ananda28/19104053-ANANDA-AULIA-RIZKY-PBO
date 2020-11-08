    package com.Ananda.Modul5;

    public class Finally {//class
        public static void main(String[] args) {//method
            //Deklarasi Array
            int[]array=new int[5];

            //protected code
            try{
                //database di open
                System.out.println("Akses Elemen ke-5\t: "+array[5]);

                //catch block
            }catch (ArrayIndexOutOfBoundsException e){
                //Exception
                System.out.println("Ada Exception Array");
            }finally {
                //database di tutup
                array[array.length -1]=10;
                System.out.println("Nilai elemen terakhir\t: "+array[array.length -1]);
            }
        }
    }
