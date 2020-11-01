package com.Ananda.Modul4.Interface;

public class Paket  extends Buku implements InterfaceCD{
    long hargaPaket;
    InterfaceCD interfaceCD;

    public Paket (String judul,
                  String pengarang,
                  long hargaBuku,
                  String ukuranCD,
                  long hargaCD){

        super(judul, pengarang, hargaBuku);
        interfaceCD = new ChildCD(ukuranCD, hargaCD);
    }

    @Override
    public void cetakCD(){
        interfaceCD.cetakCD();
    }
    @Override
    public long getHargaCD(){
        return interfaceCD.getHargaCD();
    }

    public void hitungHargaPaket(){
        hargaPaket = super.hargaBuku + getHargaCD();
    }
    public void cetakPaket (){
        super.cetakBuku();
        cetakCD();
        System.out.println("Harga Paket Buku & CD\t: " + hargaPaket);
        System.out.println();

    }
}
