//this code was written by Ananda Aulia

 //deklarasi prompt
 const prompt = require('prompt-sync')()

    function Kendaraan(noPlat, merk, pajakKendaraan){
        this.noPlat         = noPlat
        this.merk           = merk
        this.pajakKendaraan = pajakKendaraan
    }
    Kendaraan.prototype.inputAtribut = function(){
        this.noPlat         = prompt('Masukkan No. Plat        : ')
        this.merk           = prompt('Masukkan Merk            : ')
        this.pajakKendaraan = prompt('Masukkan Pajak Kendaraan : ')
    },

     Kendaraan.prototype.FasiTambahan = function(){},

     Kendaraan.prototype.printFasiTambahan = function(){},
      
     Kendaraan.prototype.hitungPajak = function(){},
     
     Kendaraan.prototype.print = function(){
         console.log('<===INFO KENDARAAN===>')
            console.log('NO. Kendaraan            : ' , this.noPlat)
            console.log('Merk Kendaraan           : ' , this.merk)
            this.printFasiTambahan()
            console.log('Masukkan Pajak Kendaraan : ' , this.pajakKendaraan)
            console.log('Total Pembayaran Pajak   : ' , this.hitungPajak)
     }
    
    //membuat turunan Sedan
    function Sedan(fasKeamanan, kapasitasCC, fasKenyamanan){
    this.fasKeamanan   = fasKeamanan
    this.kapasitasCC   = kapasitasCC
    this.fasKenyamanan = fasKenyamanan
    }
    
    Sedan.prototype = new Kendaraan()
    Sedan.prototype.constructor = Kendaraan

    Sedan.prototype.FasiTambahan = function(){
        this.fasKeamanan   = prompt('Masukkan Fasilitas Keamanan   : ')
        this.kapasitasCC   = prompt('Masukkan Kapasitas CC         : ')
        this.fasKenyamanan = prompt('Masukkan Fasilitas Kenyamanan : ')
    }

    Sedan.prototype.printFasiTambahan = function(){
        console.log('Fasilitas Keamanan   : ', this.fasKeamanan)
        console.log('Kapasitas CC         : ', this.kapasitasCC)
        console.log('Fasilitas Kenyamanan : ', this.fasKenyamanan)
    }

    Sedan.prototype.hitungPajak = function(){
        this.hitungPajak = (Number(this.pajakKendaraan * 1 + (this.pajakKendaraan * this.kapasitasCC * 0.00005)))
    }
    //membuat turunan Bus
    function Bus(kapPenumpang, kapBagasi){
        this.kapPenumpang = kapPenumpang
        this.kapBagasi    = kapBagasi
    }

    Bus.prototype = new Kendaraan()
    Bus.prototype.constructor = Kendaraan

    Bus.prototype.FasiTambahan = function(){
        this.kapPenumpang = prompt('Masukan Kapasitas Penumpang : ')
        this.kapBagasi    = prompt('Masukkan Kapasitas Bagasi   : ')
    }

    Bus.prototype.printFasiTambahan = function(){
        console.log('Kapasitas Penumpang : ', this.kapPenumpang)
        console.log('Kapasitas Bagasi    : ', this.kapBagasi)
    }

    Bus.prototype.hitungPajak = function(){
        this.hitungPajak = (Number(this.pajakKendaraan * 1 + (this.pajakKendaraan * this.kapPenumpang * this.kapBagasi * 0.00005)))
    }

    //output
    console.log('\n<== INPUT DATA ===>')
    console.log('\n1. Sedan')
    var obSedan = new Sedan()
    //input
    obSedan.inputAtribut()
    obSedan.FasiTambahan()
   

    console.log('\n2. Bus')
    var obBus = new Bus()
    //input
    obBus.inputAtribut()
    obBus.FasiTambahan()
    

    console.log('\n<== DATA SELURUH KENDARAAN ==>')
    console.log('\n1. Sedan')
    //cetak
    obSedan.hitungPajak()
    obSedan.print()
    

    console.log('\n2. Bus')
    //cetak
    obBus.hitungPajak()
    obBus.print()
    
 
