package movies

class BootStrap {

    def init = { servletContext ->
        5.times { new Movie(name: "Movie ${it+1}", dateCreated: new Date(), rating: it*0.1, isReleased: it/2).save() }
        Role admin = new Role("ROLE_ADMIN").save()
        User user = new User("user", "pass").save()
        UserRole.create(user, admin, true)
    }
    def destroy = {
    }
}
