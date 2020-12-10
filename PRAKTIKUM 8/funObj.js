//Code was written by Ananda Aulia 

//Deklarasi input dengan prompt
const prompt = require('prompt-sync')()
let total = prompt('Berapa Mahasiswa?\t: ')

var array = [] //Deklarasi Array

for(let i = 0; i < total; i++){
    console.log(`\nMahasiswa ${ i }`)

    let name = prompt('Masukkan Nama\t\t\t: ')
    let nim  = prompt('Masukkan NIM\t\t\t: ')
    let birth = prompt('Masukkan Tanggal Lahir\t: ')

    let mahasiswa = new Mahasiswa(name, nim, birth) 
    array.push(mahasiswa)
}

let index = 0


for(let x in array){
    console.log(`\nMahasiswa\t: ${ index }`)
    index++
    console.log(`Nama\t\t\t: ${ array[x].fullName() }`)
    console.log(`Tanggal Lahir\t\t\t: ${ array[x].birth}`)
    console.log(`NIM\t\t\t: ${ array[x].nim}`)
    console.log(`Umur\t\t\t: ${ array[x].age()}`)
}

function Mahasiswa(name, nim, birth){
    this.name = name
    this.nim = nim
    this.birth = birth
    this.age = function(){
        //function slice untuk mendapatkan nilai dari n sampai akhir
        let year =  this.birth.slice(this.birth.length - 4)
        return 2020 - year
      }
}