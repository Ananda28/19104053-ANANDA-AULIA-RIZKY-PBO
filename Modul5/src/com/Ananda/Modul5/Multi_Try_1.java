    package com.Ananda.Modul5;

    public class Multi_Try_1 {//class
        public static void main(String[] args) {//method
            //Deklarasi Array
            int[]array = new int[5];

            //multi try catch
            //protected code
            try {
                array[5]=30/0;
                System.out.println(array[5]);

                //catch block
            }catch (ArrayIndexOutOfBoundsException | ArithmeticException e){
                System.out.println("Panjang kurang dari 5!!");
                System.out.println("Jangan dibagi 0!");
            }
        }
    }
