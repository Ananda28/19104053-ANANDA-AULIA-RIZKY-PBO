    package com.Ananda.Tugas4.Abstract;

    import java.util.Random;

    public class DemoEmployee {
        public static void main(String[] args) {
            Employee [] employees = {
                    new SalariedEmploye("Ananda",
                            "19104053",
                            500000,
                            300000,
                            3,
                            (float) 0),
                    new CommissionEmployee("Aulia",
                            "19104054",
                            700000,
                            300000,
                            2,
                            5),
                    new ProjectPlanner("Rizky",
                            "19104055",
                            900000,
                            400000,
                            5,
                            7)
            };
            //random index
            Random pilihan = new Random();
            Employee karyawan = employees[pilihan.nextInt(employees.length)];

            // Get gaji
            System.out.println("Semua gaji karyawan");
            karyawan.getGaji();

        }
    }
