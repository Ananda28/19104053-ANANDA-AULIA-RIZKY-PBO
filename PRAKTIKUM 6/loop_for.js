//for loop
for(var i = 0; i < 5; i ++){
    console.log(i +'. Berfikir')
}
console.log('\n')

//for/in
var nama = [{fName : 'Ananda', lName : 'Ananda', age : 20}, {fName : 'Aulia', lName : 'Aulia', age : 20}]

for(var x in nama){
    console.log('Asprak\t: ')
    console.log(nama[x].fName)
    console.log(nama[x].lName)
    console.log(nama[x].age)
    console.log('\n')
}

//foor/of
var buah = ['apel', 'anggur', 'jeruk']
for(var x of buah){
    console.log('ini buah ' + x)
}