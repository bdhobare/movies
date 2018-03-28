package movies

class UrlMappings {

    static mappings = {
        "/api/movies"(resources:"movie")

        "/"(controller: 'application', action:'index')
        "500"(view: '/error')
        "404"(view: '/notFound')
        "/unreleased"(controller: 'movie', action: 'unreleased')
    }
}
