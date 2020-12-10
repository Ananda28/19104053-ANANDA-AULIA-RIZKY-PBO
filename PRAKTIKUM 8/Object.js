//Code was written by Ananda Aulia
var person0 = {}

var person1 = { name: 'Ananda' }

//Membuat Object baru
var person2 = new Object()
person2.name = 'Rizky'

//Menambahkan property baru
person1.age = 20
person2.age = 21

//cara pertama akses
console.log('Object dari person1 : ')
console.log(`Name\t: ${ person1.name }`)
console.log('Age\t\t: ' + person1.age)

console.log()

//cara kedua akses
console.log('Object dari person2 : ')
console.log(`Name\t: ${ person2['name'] }`)
console.log('Age\t\t: ' + person2['age'])