//code was written by Ananda Aulia

//function penggabungan 2 subject
function mixin(receiver, supplier){
    for(var property in supplier){
        if(supplier.hasOwnProperty(property)){
            receiver[property] = supplier[property]
        }
    }
    return receiver
}

//objek person
var person = (function(){

    var name = 'Chara'
    var age = 25


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
        setName : setName, getName : getName, getAge : getAge
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