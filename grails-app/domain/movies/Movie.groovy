package movies
//@Resource(readOnly = false, formats = ['json', 'xml'])
class Movie {
    String name;
    Date dateCreated;
    Double rating;
    boolean isReleased;
}