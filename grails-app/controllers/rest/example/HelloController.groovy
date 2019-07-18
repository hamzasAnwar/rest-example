package rest.example


import grails.rest.*
import grails.converters.*

class HelloController {
	static responseFormats = ['json', 'xml']
	
    def index() {
        render contentType: "application/json", text: '{"response":"Hello World!"}'
    }
}
