//Code was written by Ananda Aulia

var array = []//Deklarasi Array 

var mahasiswa  = (function(){
    const prompt = require('prompt-sync')()
    //function menambahkan data mahasiswa
    function tambahMhs(){
        console.log("Tambah Mahasiswa")
        nama = prompt("Input Nama\t\t : ")
        tglLahir = prompt("Input Tanggal Lahir\t : ")
        nim = prompt("Input NIM\t\t : ")
            console.log(" Pilih Prodi")
            console.log(" 1. S1 SE")
            console.log(" 2. S1 IF")
            console.log(" 3. S1 SI")
        prodi = prompt("Input angka Prodi\t: ")
            switch (prodi){
                case '1' : 
                    prodi = 'S1 SE'
                    break
                case '2' : 
                    prodi = 'S1 IF'
                    break
                case '3' : 
                    prodi = 'S1 SI'
                    break
                default :
                prodi = 'NOPE'
        }
        return {
            nama : nama,
            tglLahir : tglLahir,
            nim : nim,
            prodi : prodi,
            grade : null
        }
        
    }
    //fungsi input
    function inputan(input){
        return prompt(input)
    }
    //penilaian
    function Grade (nilai){
        if (nilai > 80 && nilai <= 100){
        return 'A'
        }
        else if (nilai > 60 && nilai <= 80){
        return 'B'
        }

        else if (nilai > 40 && nilai <= 60){
            return 'C'
        }

        else if (nilai > 0 && nilai <= 40){
            return 'D'    
        }
    }

//menginputkan nilai dengan berdasarkan urutan mahasiswa
    function cariData(){
        var urutan  = mahasiswa.inputan('Masukkan No.urutan : ')
        var index   = urutan-1;
        var nilai   = mahasiswa.inputan('Masukkan nilai     : ')
        
        array[index].grade= mahasiswa.Grade(nilai)

    }

//menampilkan data mahasiswa
    function dataMhs(){
        let index = 0
        for(let x in array){
            console.log(`\nMahasiswa ${ index }`)
            index++
            console.log("Nama\t\t: " + array[x].nama)
            console.log("Tanggal Lahir\t: " + array[x].tglLahir)
            console.log("NIM\t\t: " + array[x].nim )
            console.log("Prodi\t\t: "+ array[x].prodi) 
            console.log("Grade\t\t: "+ array[x].grade)
            console.log()
            
        }
    }
    
    return {
        tambahMhs : tambahMhs,
        Grade     : Grade,
        inputan   : inputan,
        dataMhs   : dataMhs,
        cariData  : cariData  
    }

}())

//Menampilkan menu penilaian
var pilihMenu = true

while(pilihMenu){
    console.log("<====================>")
    console.log("    MENU PENILAIAN    ")
    console.log("<====================>")
    console.log("1. Tambah Mahasiswa")
    console.log("2. Penilaian")
    console.log("3. Daftar Mahasiswa")
    console.log("4. Keluar")

    var pilihan = mahasiswa.inputan('Masukan pilihan\: ')
    //pilihan menu 
    switch(pilihan){
    case '1':
        array.push(mahasiswa.tambahMhs())
        break;
    case '2' :
        pilihan = mahasiswa.cariData()
        break;
    case '3' :
        pilihan = mahasiswa.dataMhs()
        break;
    case '4' :
        console.log('BYEE!')
        pilihMenu = false
        break; 
    default:
        console.log("Pilihan tidak ditemukan")
    }
}

