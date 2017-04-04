package library

class Author {
    String name;
    static hasMany = [books: Books]
    static constraints = {
    }
}
