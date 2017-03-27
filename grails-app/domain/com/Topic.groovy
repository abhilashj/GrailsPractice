package com

class Topic {
    String name
    static belongsTo = [user : helloworld.User]
    static constraints = {
    }
}
