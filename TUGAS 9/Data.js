//Code was written by Ananda Aulia

//Deklarasi input dengan prompt
const prompt = require('prompt-sync')()

var array = [] //Deklarasi Array 
var nilai

function Mahasiswa(name, birth, nim, prodi){
    this.name = name
    this.birth = birth
    this.age = function(){
        let year  = this.birth.slice(this.birth.leght - 4)
        return 2020 - year
    }
    this.nim = nim
    this.prodi = prodi
    this.grade = null
}

//Deklrasi Bagian Tambah Mahasiswa
function tambahMhs(){
    console.log("<=== Tambah Penilaian ===>")
    let name = prompt("Input Nama\t\t : ")
    let birth = prompt("Input Tanggal Lahir\t : ")
    let nim = prompt("Input NIM\t\t : ")
        console.log()
        console.log("<=== Pilih Prodi ===>")
        console.log("1. S1 SE")
        console.log("2. S1 IF")
        console.log("3. S1 SI")
    let prodi = prompt("Input Angka Prodi\t: ")
        switch (prodi){
            case '1':
                prodi = 'S1 SE'
                break
            case '2':
                prodi = 'S1 IF'
                break
            case '3':
                prodi = 'S1 SI'
                break
            default :
                prodi = 'Tidak Tersedia'
    }
    let mahasiswa = new Mahasiswa(name,birth,nim,prodi)
    array.push(mahasiswa)
}

//Deklarasi Bagian Penilaian
function Grade(nilai){
    if(nilai > 80 && nilai <= 100){
        return 'A'
    }else if(nilai > 60 && nilai <= 80){
        return 'B'
    }else if(nilai > 40 && nilai <= 60){
        return 'C'
    }else if(nilai > 0 && nilai <= 40){
        return 'D' 
    }
}
function cariData(){
    var cariNim = prompt('Masukkan NIM: ')
    var nilai = prompt('Masukkan Nilai: ')

    var index = array.findIndex(function(data){
        return data['nim'] == cariNim;
    })
    array[index]['grade'] = Grade(nilai)
}

//Deklarasi Bagian Lihat Data
function DataMhs(){
    let index = 0
for(let x in array){
    var umur = array[x].age()
    console.log(`\nMahasiswa ${ index }`)
    index++
    console.log(`Nama\t\t: ${array[x].name}`)
    console.log(`Tanggal Lahir\t: ${ array[x].birth}`)
    console.log(`NIM\t\t: ${ array[x].nim}`)
    console.log(`Grade\t\t: ${ array[x].grade} `)
    }
}

var pilihMenu = true

while(pilihMenu){
console.log("<==== Menu Penilaian ====>")
console.log("1. Tambah Mahasiswa")
console.log("2. Penilaian")
console.log("3. LIhat Data Mahasiswa")
console.log("4. Keluar")
console.log()

var pilihan = prompt('Masukkan Pilihan\: ')
switch(pilihan){
    case '1':
        pilihan = tambahMhs()
        break
    case '2':
        pilihan = cariData()
        break
    case '3':
        pilihan = DataMhs()
        break
    case '4':
        console.log('BYE!!')
        pilihMenu = false
        break
    default:
        console.log('Pilihan Tidak Ditemukan')
}
}