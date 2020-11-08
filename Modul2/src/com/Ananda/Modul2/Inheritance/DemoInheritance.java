    package com.Ananda.Modul2.Inheritance;

    public class DemoInheritance {
        public static void main(String[] args) {
            A superclass = new A(); // A = kelas
            B subclass = new B(); // B = kelas

            System.out.println("Masukkin data ke SuperClass");
            superclass.x = 10;
            superclass.y = 50;
            superclass.printXY();

            subclass.x = 30;
            subclass.y = 40;
            subclass.z = 10;
            subclass.printXY();
            subclass.sumValue();
        }
    }
