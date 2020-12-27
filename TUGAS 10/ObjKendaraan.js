//this code was written by Ananda Aulia

 //deklarasi prompt
 const prompt = require('prompt-sync')()

var Kendaraan = {
    inputAtribut : function(noPlat, merk, pajakKendaraan){
        this.noPlat         = prompt('Masukkan No. Plat        : ')
        this.merk           = prompt('Masukkan Merk            : ')
        this.pajakKendaraan = prompt('Masukkan Pajak Kendaraan : ')
    },

     FasiTambahan : function(){},

     printFasiTambahan : function(){},
     
     hitungPajak : function(){},
     
     print : function(){
         console.log('<===INFO KENDARAAN===>')
            console.log('NO. Kendaraan            : ' , this.noPlat)
            console.log('Merk Kendaraan           : ' , this.merk)
            this.printFasiTambahan()
            console.log('Masukkan Pajak Kendaraan : ' , this.pajakKendaraan)
            console.log('Total Pembayaran Pajak   : ' , this.hitungPajak)
     }
    }

    //membuat objek turunan Sedan
    var Sedan = Object.create(Kendaraan)

    Sedan.FasiTambahan = function(fasKeamanan, kapasitasCC, fasKenyamanan){
        this.fasKeamanan   = prompt('Masukkan Fasilitas Keamanan   : ')
        this.kapasitasCC   = prompt('Masukkan Kapasitas CC         : ')
        this.fasKenyamanan = prompt('Masukkan Fasilitas Kenyamanan : ')
    }

    Sedan.printFasiTambahan = function(fasKeamanan, kapasitasCC, fasKenyamanan){
        console.log('Fasilitas Keamanan   : ', this.fasKeamanan)
        console.log('Kapasitas CC         : ', this.kapasitasCC)
        console.log('Fasilitas Kenyamanan : ', this.fasKenyamanan)
    }

    Sedan.hitungPajak = function(hitungPajak){
        this.hitungPajak = (Number(this.pajakKendaraan * 1 + (this.pajakKendaraan * this.kapasitasCC * 0.00005)))
    }

    //membuat objek turunan Bus
    var Bus = Object.create(Kendaraan)

    Bus.FasiTambahan = function(kapPenumpang, kapBagasi){
        this.kapPenumpang = prompt('Masukan Kapasitas Penumpang : ')
        this.kapBagasi    = prompt('Masukkan Kapasitas Bagasi   : ')
    }

    Bus.printFasiTambahan = function(kapPenumpang, kapBagasi){
        console.log('Kapasitas Penumpang : ', this.kapPenumpang)
        console.log('Kapasitas Bagasi    : ', this.kapBagasi)
    }

    Bus.hitungPajak = function(hitungPajak){
        this.hitungPajak = (Number(this.pajakKendaraan * 1 + (this.pajakKendaraan * this.kapPenumpang * this.kapBagasi * 0.00005)))
    }

    //output
    console.log('\n<== INPUT DATA ===>')
    console.log('\n1. Sedan')
    //input
    Sedan.inputAtribut()
    Sedan.FasiTambahan()
    Sedan.hitungPajak()

    console.log('\n2. Bus')
    //input
    Bus.inputAtribut()
    Bus.FasiTambahan()
    Bus.hitungPajak()

    console.log('\n<== DATA SELURUH KENDARAAN ==>')
    console.log('\n1. Sedan')
    //cetak
    Sedan.print()
    console.log('\n2. Bus')
    //cetak
    Bus.print()
 
