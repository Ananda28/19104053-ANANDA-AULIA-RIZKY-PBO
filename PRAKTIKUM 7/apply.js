//This code was written by Ananda Aulia

var person = {
    fullName: function(birth, city){
        return this.firstName + " " + this.lastName + "," + birth + "," + city;
    }
};
var person1 = {
    firstName: "Ananda",
    lastName: "Aulia"
};

//menggunakan apply
console.log(person.fullName.apply(person1, ["Maret","Bekasi"]));

//jika menggunakan call
// person.fullName.call(person1,Maret,"Bekasi")