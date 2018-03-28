package movies

import grails.plugin.springsecurity.annotation.Secured
import grails.rest.*

@Secured(['ROLE_ADMIN'])
class MovieController extends RestfulController {
    static responseFormats = ['json', 'xml']
    MovieController() {
        super(Movie)
    }
    def unreleased(){
        respond Movie.findAllByIsReleased(false), view: 'index'
    }

}
