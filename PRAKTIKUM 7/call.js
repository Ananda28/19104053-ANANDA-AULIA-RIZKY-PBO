//This code was written by Ananda Aulia

//membuat method person
var person = {
    fullName: function(){
        return this.firstName + " " + this.lastName;
    }
}

var person1 = {
    firstName:"Ananda",
    lastName: "Rizky"
}

var person2 = {
    firstName:"Ananda",
    lastName:"Aulia"
}

console.log("Menggunakan method call untuk menampilkan objek person 2 : ")

//memanggil method menggunakan method call()
console.log(person.fullName.call(person2));
