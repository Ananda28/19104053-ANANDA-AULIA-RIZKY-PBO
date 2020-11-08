    package com.Ananda.Modul5;

    public class Multi_Try_2 {//class
        public static void main(String[] args) {//method
            //Deklarasi Array
            int[] array = new int[5];

            //multi try catch

            //protected code
            try {
                System.out.println(array[5]);//error
                array[5] = 30/0;//error

                //catch block
            }catch (ArrayIndexOutOfBoundsException e){//dibaca
                System.out.println("Panjang Kurang dari 5!!");
            }catch (ArithmeticException e){
                System.out.println("Jangan dibagi 0!");
            }

        }
    }
