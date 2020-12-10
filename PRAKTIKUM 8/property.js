//Code was written by Ananda Aulia 

//Deklarasi input dengan prompt
const prompt = require('prompt-sync')()

let object = {}
object.name = prompt('Input Name\t: ')
object.age = prompt('Input Age\t: ')
object.nim = prompt('Input NIM\t: ')
object.prodi = prompt('Input Prodi\t: ')

console.log()

//perulangan for each untuk mendapatkan nama property
for(property in object){
    //print nama property dan valuenya
    console.log(property + `\t: ${ object[property]} `)
}