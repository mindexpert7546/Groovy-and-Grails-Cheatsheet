package com.iinterchange.grails

class Student {

    String firstName
    String lastName
    String rollNo
    String branch

    static constraints = {
        firstName nullable:false, blank:false
        lastName nullable:false, blank:false
        rollNo nullable:false, blank:false
        branch nullable:false, blank:false
    }


}


