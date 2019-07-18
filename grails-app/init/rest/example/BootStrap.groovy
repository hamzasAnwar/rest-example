package rest.example

class BootStrap {

    def init = { servletContext ->
       new Person(name:'hamza').save()
        new Person(name:'ahmed').save()
        new Person(name:'anwar').save()
    }
    def destroy = {
    }
}
