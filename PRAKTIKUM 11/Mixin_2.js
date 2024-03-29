//code was written by Ananda Aulia

//Function penggabungan 2 object dan jika beberapa properti yang diambil
function mixin(receiver, supplier){
    for(var property in supplier){
        if(!receiver.hasOwnProperty(property)){
            receiver[property] = supplier[property]
        }
    }
    return receiver
}

//objek person
var person = (function(){

    var name = 'Chara'
    var age = 25
    var element = 'pyro'

    function setName(newName){
        name = newName
    }
    function getName(){
        return name
    }
    function getAge(){
        return age
    }
 
    return {
        setName : setName, getName : getName, getAge : getAge, element : element
    }
}())

var Title = (function(){
    var element = 'Anemo'

    //properti yang mau di masukin di person
    function InnerTitle(title){
        this.title = title
        this.element = element
    }
    return InnerTitle

}())

person.setName('Jean')

var title = new Title('Grand Master')

mixin(person, title) //penggabungan

console.log('Name\t : ',person.getName())
console.log('Age\t : ', person.getAge())
console.log('Title\t : ', person.title)
console.log('Element\t : ',person.element)