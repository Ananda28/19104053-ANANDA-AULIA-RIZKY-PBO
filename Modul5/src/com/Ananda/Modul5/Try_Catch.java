    package com.Ananda.Modul5;

    import java.io.File;
    import java.io.FileNotFoundException;
    import java.io.FileReader;

    public class Try_Catch {//class
        public static void main(String[] args) {//method

            //protected code
            try {
                //mencoba membaca berkas latihan.txt
                File file = new File("D:\\Paimon.txt");
                FileReader fileReader = new FileReader(file);

                //jika berhasil maka menampilkan pesan
                System.out.println("Read file berhasil");

                //catch block
            } catch (FileNotFoundException e) {
                //jika terjadi kesalahan maka tampilkan pesan
                System.out.println("Gaada Filenya");
            }
        }
    }
