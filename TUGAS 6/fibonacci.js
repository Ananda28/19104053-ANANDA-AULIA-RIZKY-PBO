//Deklarasi
var a = 0
var b = 1
var c = null

//input
var hasil = "Fibonacci = "

//for loop
for(var i = 0; i<=10; i++){
    a = a + b
    b = a - b
    c = c + b + ', '
}

//output
console.log(hasil + c)