//this code was written by Ananda Aulia
//Constructor Mahasiswa
function Mahasiswa(nim, nama, prodi){
    this.nim  = nim;
    this.nama = nama;
    this.prodi = prodi;

    //menambahkan method pada constructor
    this.tampil = function(){
        console.log("Nim   : ", this.nim)
        console.log("Nama  : ", this.nama)
        console.log("Prodi : ", this.prodi)
    }
}

//Deklarasi inpput dengan prompt
const prompt = require('prompt-sync')()

let jmlMhs = prompt("Jumlah mahasiswa : ")

//array untuk menampung data mahasiswa
var arrayMhs = []
//Deklarasi Object
let mhs = {}

//pembuatan object dengan constructor 
for(let i = 1; i<=jmlMhs; i++){
    console.log(`\nMahasiswa ke-${i}`)
    mhs = new Mahasiswa(
        prompt(`Masukkan Nim   : `),
        prompt(`Masukkan Nama  : `),
        prompt(`Masukkan Prodi : `)
    )

    arrayMhs.push(mhs)
}

console.log("Data berhasil tersimpan\n")

var editData = prompt("Ingin mengubah data? ya/tidak : ")

if (editData == 'ya'){
    var noMhs = prompt('Masukkan nomor urut mahasiswa : ')
    Mahasiswa.prototype.edit = function(){
        nim   = prompt(`Masukkan Nim   : `),
        nama  = prompt(`Masukkan Nama  : `),
        prodi = prompt(`Masukkan Prodi : `)
        tampil= this.tampil
        return{nim, nama, prodi, tampil} 
    }

    let index = noMhs-1
    arrayMhs[index] = arrayMhs[index].edit()

    console.log('\nData setelah diubah')
    index = 1
    for(let i in arrayMhs){
        console.log(`\nMahasiswa ke-${index}`)
        index++
        arrayMhs[i].tampil()
    }
}else if(editData == 'tidak'){
    index = 1
    for(let i in arrayMhs){
        console.log(`\nMahasiswa ke-${index}`)
        index++
        arrayMhs[i].tampil()
    }
}