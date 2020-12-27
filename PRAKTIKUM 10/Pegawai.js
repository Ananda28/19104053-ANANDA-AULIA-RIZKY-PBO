//this code was written by Ananda Aulia
var Pegawai = {
    inputData : function(nip, nama, alamat, gajiPokok) {
        this.nip       = prompt('Masukkan NIP        : '),
        this.nama      = prompt('Masukkan Nama       : '),
        this.alamat    = prompt('Masukkan Alamat     : '),
        this.gajiPokok = prompt('Masukkan Gaji Pokok : ')
    },
    inputTunjangan : function(tunjangan) {
        this.tunjangan = prompt('Masukkan Tunjangan  : ');
    },
    print : function(){
        console.log('NIP        : ', this.nip),
        console.log('Nama       : ', this.nama),
        console.log('Alamat     : ', this.alamat),
        console.log('Gaji Pokok : ', this.gajiPokok),
        console.log('Tunjangan  : ', this.tunjangan),
        console.log('Total Gaji : ',((this.gajiPokok * 1) + (this.tunjangan)));
    }
}

//Membuat objek turunan sales
var Sales = Object.create(Pegawai)
Sales.inputTunjangan = function(){
    jmlPelanggan = prompt('Masukkan jumlah pelanggan yang direkrut\t:')
    this.tunjangan = jmlPelanggan * 50000
}

//Membuat objek turunan satpam
var Satpam = Object.create(Pegawai)
Satpam.inputTunjangan = function(tunjangan){
    jam = prompt('Masukkan Jumlah Lembur (dalam jam)\t: ')
    this.tunjangan = jam * 10000
}

//Membuat objek manager
var Manager = Object.create(Pegawai)
Manager.inputTunjangan = function(tunjangan){
    thMasuk = prompt('Masukkan Tahun Masuk\t: ')
    lamaKerja = 2020 - thMasuk
    if(lamaKerja <= 3){
        this.tunjangan = 5 / 100 * this.gajiPokok
    }else{
        this.tunjangan = 10 / 100 *this.gajiPokok
    }
}

//deklarasi prompt
const prompt = require('prompt-sync')()

console.log('Data Pegawai PT ABC')
console.log('\n1. Satpam')
Satpam.inputData()
Satpam.inputTunjangan()

console.log('\n2. Sales')
Sales.inputData()
Sales.inputTunjangan()

console.log('\n3. Manager')
Manager.inputData()
Manager.inputTunjangan()

console.log('\n<===== Hasil Input Data Pegawai =====>')
console.log('\n1. Data Satpam')
Satpam.print()
console.log('\n2. Data Sales')
Sales.print()
console.log('\n3. Data Manager')
Manager.print()