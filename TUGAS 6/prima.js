//input
var hasil = "Bilangan Prima = "

//for loop
for(var i = 1; i <= 50; i++){
     angka = 0
    for(var j = 1; j<= i; j++){
        if( i % j ==0){
            angka = angka +1
        }
    }if(angka == 2){
        hasil += i + ', '
    }
}
//output
console.log(hasil)
