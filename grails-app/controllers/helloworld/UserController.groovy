package helloworld
import java.sql.Date

class UserController {

    def index() {
        User user = new User()
        user.DateOfBirth = "12/03/1993";
        user.Name = "Abhilash"
        user.EMail = "abhilashjha@gmail.com"
        user.UserName ="demo"
        user.save(flush:true)
    }

}
