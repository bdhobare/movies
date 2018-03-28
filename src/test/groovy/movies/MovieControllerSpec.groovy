package movies

import grails.testing.web.controllers.ControllerUnitTest
import org.grails.testing.GrailsUnitTest
import spock.lang.Specification

class MovieControllerSpec extends Specification implements ControllerUnitTest<MovieController> {

    //Test that authorization works

    void "Unauthorized Access"() {
        when 'movies is invoked'
        controller.index()

        then "401 :Unauthorized is returned"
        response.status/100 == 4
    }
}