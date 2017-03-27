package helloworld

class User {
    String Name
    String UserName
    String EMail
    String DateOfBirth
    static hasMany = [topic : com.Topic]

    static constraints = {
    }
}
