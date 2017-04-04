package icecream

class Flavor {
    String name;
    static belongsTo = Shop
    static hasMany = [shops : Shop]

    static constraints = {
    }
}
