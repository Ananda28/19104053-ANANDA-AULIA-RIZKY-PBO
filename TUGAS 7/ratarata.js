//This code was written by Ananda Aulia

//atribut
var arr = new Array(80,90,67,90,100);
var avg = arrayAverage(arr);

//menggunankan function parameter
function arrayAverage(arr){
    //menemukan sum
    var sum = 0;
    for(var i in arr) {
        sum += arr[i];
    }
    //panjang array
    var numbersbagi = arr.length;
    //hasil
    return (sum / numbersbagi);
}

function myFunction2(arg1, arg2){
    this.Name  = arg1
    this.arr   = arg2
}

//membuat objek dari fungsi myfunction
var x = new myFunction2('Indah Pertiwi', avg)

//output
console.log("Nama : " + x.Name )
console.log("Rata - rata nilai kamu : " + avg)
