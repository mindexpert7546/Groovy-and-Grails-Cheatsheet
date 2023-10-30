package com.baeldung.grails

import grails.transaction.Transactional

@Transactional
class TeacherService {

    def get(id){
        Teacher.get(id)
    }

    def list() {
        Teacher.list()
    }

    def save(teacher){
        teacher.save()
    }

    def delete(id){
        Teacher.get(id).delete()
    }
}
