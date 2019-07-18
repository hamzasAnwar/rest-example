package rest.example


import grails.rest.*
import grails.converters.*

class PersonController extends RestfulController {
	static responseFormats = ['json', 'xml']
	
    PersonController(){
        super(Person)
    }
}
