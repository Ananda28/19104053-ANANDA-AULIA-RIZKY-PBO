//This code was written by Ananda Aulia

//tipe data
var nilai;

//percabangan
function nilaiPredikat(nilai) {    
    if(nilai > 85 && nilai <= 100){
        return 'A'
    }else if(nilai > 75 && nilai <= 84){
        return 'B'
    }else if(nilai > 65 && nilai <= 75){
        return 'BC'
    }else if(nilai > 55 && nilai <= 64){
        return 'C'
    }else if(nilai > 45 && nilai <= 54){
        return 'D' 
    }else if(nilai > 0 && nilai <= 44){
        return 'E'
    }
   }

//membuat objek dari fungsi myFunction
function myFunction2(arg1,arg2){
    this.Name  = arg1
    this.nilai = arg2
}

var x = new myFunction2('Bambang Susilo' ,78)
var hasil = nilaiPredikat(x.nilai)

//output
console.log("Masukkan Nama  :" + x.Name)
console.log("Masukkan Nilai :" + x.nilai)
console.log(x.Name + ' Kamu mendapatkan predikat ' + hasil)
