//Code was written by Ananda Aulia 

//Deklarasi input dengan prompt
const prompt = require('prompt-sync')()

let total = prompt('Berapa Mahasiswa?\t: ')

var array = [] //Deklarasi Array
var mahasiswa = {} //Deklarasi Object

for(let i = 0; i < total; i++){
    console.log(`\nMahasiswa ${ i }`)
    mahasiswa = {
        firstName : prompt('Input Nama Depan\t\t: '),
        lastName  : prompt('Input Nama Belakang\t\t: '),
        fullName  : function(){
            //mengembalikan nilai dengan return
            //this merujuk pada object person
            return this.firstName + " " + this.lastName
    },
    birth : prompt('Input Tanggal Lahir\t\t: '),
    nim   : prompt('Input NIM\t\t\t: '),
    age   : function(){
        //function slice untuk mendapatkan nilai dari n sampai akhir
        let year =  this.birth.slice(this.birth.length - 4)
        return 2020 - year
      }
   }
    array.push(mahasiswa)
}
console.log()

let index = 0


for(let x in array){
    console.log(`\nMahasiswa\t: ${ index }`)
    index++
    console.log(`Nama\t\t\t: ${ array[x].fullName() }`)
    console.log(`Tanggal Lahir\t\t\t: ${ array[x].birth}`)
    console.log(`NIM\t\t\t: ${ array[x].nim}`)
    console.log(`Umur\t\t\t: ${ array[x].age()}`)
}