package icecream

class Shop {
    String name;
    static hasMany = [flavors: Flavor]
    static constraints = {
    }
}
