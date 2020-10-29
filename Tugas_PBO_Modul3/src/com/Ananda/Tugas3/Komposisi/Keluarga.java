    package com.Ananda.Tugas3.Komposisi;

    import net.sf.cglib.asm.$AnnotationVisitor;

    import java.util.ArrayList;
    import java.util.List;

    public class Keluarga {//class
        private List<Anak> anakList = new ArrayList<>();//tipe data
        private String namaKeluarga;
        private String kotaAsal;
        private Ayah ayah;
        private Ibu ibu;

        //constructor
        public Keluarga(String namaKeluarga, String kotaAsal) {
            this.namaKeluarga = namaKeluarga;
            this.kotaAsal = kotaAsal;
        }

        //getter
        public String getNamaKeluarga() {
            return namaKeluarga;
        }

        public String getKotaAsal() {
            return kotaAsal;
        }

        public void addAnggotaKeluarga(Ayah ayah, Ibu ibu, List<Anak> anaks){
            this.ayah = ayah;
            this.ibu = ibu;
            this.anakList = anaks;
        }

        public List<Anak> getAnakList() {
            return anakList;
        }

        public Ayah getAyah() {
            return ayah;
        }

        public Ibu getIbu() {
            return ibu;
        }

        //output
        public void getData(){
            System.out.println("Nama Keluarga : " + getNamaKeluarga());
            System.out.println("Kota          : " + getKotaAsal());
            System.out.println("Nama Ayah     : " + getAyah().getNamaAyah());
            System.out.println("Nama Ibu      : " + getIbu().getNamaIbu());
            System.out.println("Jumlah Anak   : " + getAnakList().size());
            System.out.println("Nama Anak     : ");
                for (int i = 0; i < getAnakList().size(); i++){
                    System.out.println((i + 1) + ". " + getAnakList().get(i).getNamaAnak());
                }
        }
    }
