    package com.Ananda.Tugas3.Komposisi;

    import java.util.ArrayList;
    import java.util.List;

    public class DemoKeluarga {//class
        public static void main(String[] args) {//method
            Keluarga keluarga = new Keluarga("Budi", "Bekasi");
            List<Anak> anaks = new ArrayList<>();
            anaks.add(new Anak(1,"Ananda", 20,"Kandung"));
            anaks.add(new Anak(2,"Adinda", 16,"Kandung"));
            anaks.add(new Anak(3,"Hamzah", 14,"Kandung"));

            keluarga.addAnggotaKeluarga(new Ayah(1,"Budi",45),
                    new Ibu(1,"Wati",40),anaks);

            keluarga.getData();
        }
    }
