package library

class Books {
    String name
    static hasOne = [author: Author]
    //static belongsTo = [author: Author]
    static constraints = {
    }
}
