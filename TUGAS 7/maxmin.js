//This code was written by Ananda Aulia

var nums = [5 ,6 ,2 ,3 , 7]

//menggunakan apply
var max = Math.max.apply(Math, nums)
var min = Math.min.apply(Math, nums)

//output
console.log("Nilai : " + nums)
console.log("Nilai maksimum : " + max)
console.log("Nilai minimum  : " + min)