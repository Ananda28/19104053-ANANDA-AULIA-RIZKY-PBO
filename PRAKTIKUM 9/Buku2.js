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
for(let i = 1; i<=jmlBuku; i++){
    console.log("\n")
    buku = new Buku(
        prompt(`Masukkan judul buku ke-${i}     : `),
        prompt(`Masukkan nama pengarang ke-${i} : `),
        prompt(`Masukkan nama penerbit ke-${i}  : `),
        prompt(`Masukkan tahun terbit ke-${i}   : `)
    )
    arrayBuku.push(buku)
}
 var dataEdit = prompt('\nIngin mengubah data? (Ya/Tidak) : ')

 if(dataEdit == 'Ya'){
     var noBuku = prompt('Masukkan Urutan Buku : ')

     var namaData = prompt(`Data yang diubah (Judul/Pengarang/Penerbit/Tahun Terbit) : `)
    //menambah properti ke dalam objek
    if(namaData == 'Judul'){
        let index = noBuku - 1 
        arrayBuku[index].judulBuku = prompt(`Masukkan judul buku ke-${noBuku} : `)
    }else if(namaData == 'Pengarang'){
        let index = noBuku -1
        arrayBuku[index].pengarang = prompt(`Masukkan pengarang buku ke-${noBuku} : `)
    }else if(namaData == 'Penerbit'){
        let index = noBuku -1
        arrayBuku[index].penerbit = prompt(`Masukkan penerbit buku ke-${noBuku} : `)
    }else if(namaData == 'Tahun Terbit'){
        let index = noBuku -1
        arrayBuku[index].thTerbit = prompt(`Masukkan tahun terbit buku ke-${noBuku} : `)
    }else{
        console.log(`Nama data yang dimasukkann tidak sesuai`)
    }
                    
    console.log(`\n\nData buku yang berhasil disimpan`)

    let index = 1;

     //menampilkan object
    for(let i in arrayBuku){
        console.log(`\nBuku ke-${index}`)
        index++
        arrayBuku[i].tampil()
        }

}else if(dataEdit == 'Tidak'){
    console.log('\n\nDana Buku yang berhasil disimpan')

    let index = 1;
    //menampilkan object
    for(let i in arrayBuku){
        console.log(`\nBuku ke-${index}` )
        index++
        arrayBuku[i].tampil()
    }

}else{
    console.log('\n\nPilihan yang dimasukkan tidak sesuai')
}
