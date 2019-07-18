package rest.example

class Person {

    String name

    static constraints = {
        name nullable:false, size:3..5, unique:true
    }
}
