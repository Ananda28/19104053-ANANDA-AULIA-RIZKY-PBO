//Code was written by Ananda Aulia

//Deklarasi input dengan prompt
const prompt = require('prompt-sync')()

var arrayHwn = [] //Deklarasi Array 
var hwn = {}

function Hewan(nama, jenis, umur, makanan, rpenyakit){
    this.nama  = nama
    this.jenis = jenis
    this.umur  = umur
    this.makanan = makanan
    this.rpenyakit = rpenyakit
    
    this.tampil = function(){
        console.log("Nama    : ", this.nama)
        console.log("Jenis   : ", this.jenis)
        console.log("Umur    : ", this.umur)
        console.log("Makanan : ", this.makanan)
        console.log("Riwayat Penyakit : ", this.rpenyakit)   
      }
}

//Deklrasi Bagian Tambah Hewan
function tambahHwn(){
 console.log("<=== Tambah Hewan ===>")
 let jmlHwn = prompt("Jumlah Hewan : ")
  for(let i=1; i<=jmlHwn; i++){
    console.log()

     hwn = new Hewan(
       console.log(`\nHewan ke-${i}`),
       prompt(`Masukkan Nama ke-${i}   : `),
       prompt(`Masukkan Jenis ke-${i}  : `),
       prompt(`Masukkan Umur ke-${i}   : `),
       prompt(`Masukkan Makann ke-${i} : `),
       prompt(`Masukkan Riwayat Penyakit ke-${i} : `)   
    )
    arrayHwn.push(hwn)
    }
}

function EditHewan(){
    console.log()
    console.log("<=== Edit Hewan ===>")
    var noHwn = prompt('Masukkan nomor urut hewan : ')
    Hewan.prototype.edit = function(){
        nama  = prompt(`Masukkan Nama  : `),
        jenis = prompt(`Masukkan Jenis : `),
        umur  = prompt(`Masukkan Umur  : `),
        makanan = prompt(`Masukkan Makanan : `),
        rpenyakit = prompt(`Masukkan Riwayat Penyakit : `),
        tampil = this.tampil
        return{nama,jenis,umur,makanan,rpenyakit,tampil}
    }
    let index = noHwn-1
    arrayHwn[index] = arrayHwn[index].edit()
}

//Deklarasi Bagian Lihat Data
function DataHwn(){
    console.log("<=== Lihat Data Hewan ===>")
    console.log('\nData setelah diubah')
    let index = 1
    for(let i in arrayHwn){
        console.log(`\nHewan ke-${index}`)
        index++
        arrayHwn[i].tampil()
        }
    }

var pilihMenu = true

while(pilihMenu){
console.log("<==== Menu Penilaian ====>")
console.log("1. Tambah Hewan")
console.log("2. Edit Hewan")
console.log("3. Tampil Hewan")
console.log("4. Keluar")
console.log()

var pilihan = prompt('Masukkan Pilihan\: ')
switch(pilihan){
    case '1':
        pilihan = tambahHwn()
        break
    case '2':
        pilihan = EditHewan()
        break
    case '3':
        pilihan = DataHwn()
        break
    case '4':
        console.log('BYE!!')
        pilihMenu = false
        break
    default:
        console.log('Pilihan Tidak Ditemukan')
}
}