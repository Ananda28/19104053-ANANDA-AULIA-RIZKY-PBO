//this code was written by Ananda Aulia
//Constructor Buku
function Buku(judulBuku, pengarang, penerbit, thTerbit){
    this.judulBuku = judulBuku;
    this.pengarang = pengarang;
    this.penerbit  = penerbit;
    this.thTerbit  = thTerbit;

    //Menambah method pada constructor
    this.tampil = function(){
        console.log("Judul Buku   : ", this.judulBuku)
        console.log("Pengarang    : ", this.pengarang)
        console.log("Penerbit     : ", this.penerbit)
        console.log("Tahun Terbit : ", this.thTerbit)
    }
}

//Deklarasi input dengan prompt
const prompt = require('prompt-sync')()

let jmlBuku = prompt("Jumlah buku yang di masukkan : ")

//array untuk menampung data buku
var arrayBuku = []

//Deklarasi Object
var buku = {}

//Pembuatan object dengan constructor
for(let i = 1; i<=jmlBuku; i ++){
    console.log("\n")
    buku = new Buku(
        prompt(`Masukkan judul buku ke-${i}     : `),
        prompt(`Masukkan nama pengarang ke-${i} : `),
        prompt(`Masukkan nama penerbit ke-${i}  : `),
        prompt(`Masukkan tahun terbit ke-${i}   : `)
    )
    arrayBuku.push(buku)
}

console.log(`\n\Data buku yang berhasil dimasukkan`)

let index = 1;

//menampilkan object
for(let i in arrayBuku){
    console.log(`\nBuku ke-${index}`)
    index++
    arrayBuku[i].tampil()
}