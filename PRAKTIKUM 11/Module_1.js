//code was written by Ananda Aulia
var person = (function(){
    var age = 20

    return{
        name : "Ananda",

        getAge : function(){
            return age
        },
        
        growOlder : function(){
            age++
        }
    }
}())

console.log('Nama Person\t: ', person.name)
console.log('Umur Person\t: ', person.getAge())

//mengganti umur
person.age = 25
console.log('Umur person yang diganti\t: ', person.getAge())

person.growOlder()
console.log('Umur person yang ditambah\t: ', person.getAge())