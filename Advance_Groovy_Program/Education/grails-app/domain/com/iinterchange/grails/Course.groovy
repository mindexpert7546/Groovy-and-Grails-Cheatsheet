package com.iinterchange.grails

class Course {
    String courseName
    static constraints = {
         courseName nullable:false, blank:false
    }
}
