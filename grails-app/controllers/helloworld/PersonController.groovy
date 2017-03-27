package helloworld

class PersonController {

    static allowedMethods = "POST"

    def index() {


        render("Hello world ${flash.message}")
    }

    def list() {

        println params.firstName
        User user = User.findById(1)
        render(view: "list", model: [personModel: "This is list method", user: user])
    }

    def show() {

    }

    def viewList() {
        println (params.firstName)
        println (params.lastName)
        println("This methid viewList")

        flash.message = "This is flash message"

        redirect(action: "demo", params: params)
    }

    def demo() {

//        render(flash.message)
        redirect(action: "index")
    }
}
