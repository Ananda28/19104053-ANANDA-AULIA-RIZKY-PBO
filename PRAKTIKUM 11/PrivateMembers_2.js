//code was written by Ananda Aulia
var Person = (function() {
    var age = 20 //definisi variable private

    function InnerPerson(name){
        this.name = name
    }

    InnerPerson.prototype.getAge = function(){
        return age
    }

    InnerPerson.prototype.growOlder = function(){
        age++
    }

    return InnerPerson
}())

var person1 = new Person('Nanda')
var person2 = new Person('Aulia')

console.log('Nama Person\t: ', person1.name)
console.log('Umur Person\t: ', person1.getAge())

console.log('\nNama Person 2\t: ', person2.name)
console.log('Umur Person 2\t: ', person2.getAge())

console.log()
//mengganti umur
person1.growOlder()
console.log(`Umur ${person1.name} yang ditambah\t: `, person1.getAge())
console.log(`Umur ${person2.name} yang ditambah\t: `, person2.getAge())