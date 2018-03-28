package movies

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class MovieSpec extends Specification implements DomainUnitTest<Movie> {

    //test that a movie is created with the correct parameters
    void "Test Movie Creation"() {
        when "Movie.save() is invoked"
        def movie = new Movie(name: 'Unit Test Movie', dateCreated: new Date(), isReleased: false, rating: 5.0).save()

        then 'Movie is saved'
        movie != null
    }
    void "Test that all parameters are needed for movie creation"(){
        when "Movie.save() is invoked"
        def movie = new Movie(name: 'Unit Test Movie').save()

        then "Movie is null"
        movie == null
    }

}
