//code was written by Ananda Aulia
function Person(name) {
    var age = 20 //definisi variable private

    this.name = name
    
    this.getAge = function(){
        return age
    }

    this.growOlder = function(){
        age++
    }
}

var person = new Person('Nanda')

console.log('Nama Person\t: ', person.name)
console.log('Umur Person\t: ', person.getAge())

//mengganti umur
person.age = 25
console.log('Umur person yang diganti\t: ', person.getAge())

person.growOlder()
console.log('Umur person yang ditambah\t: ', person.getAge())