package com.baeldung.grails

class TeacherController {

    def teacherService

    def index() {
        respond teacherService.list()
    }

    def show(Long id) {
        respond teacherService.get(id)
    }

    def create() {
        respond new Teacher(params)
    }

    def save(Teacher teacher) {
        teacherService.save(teacher)
        redirect action:"index", method:"GET"
    }

    def delete(Long id) {
        teacherService.delete(id)
        redirect action:"index", method:"GET"
    }
}