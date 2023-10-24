class Map{
   static main(args) {
        // Add values to map
        def student1 = [:] // Initialize empty map
        student1.put('name', 'John') // java notation
        student1['surname'] = 'Doe' // You can state key in square brackets
        student1 << [age: 17] // This is something output redirection in unix commands. key-value pair put inside map object
        student1.class = "11C" // Dot notation is also available
        student1.'school' = "Groovy School" // Same as previous
         
        println "Student 1 info: ${student1}" // Student info: [name:John, surname:Doe, age:17, class:11C, school:Groovy School]
         
        // Remove element from map
        def student2 = [name: 'John', surname: 'Doe', age: 17, class: '11C', school: 'Groovy School']
        student2.remove('age') // Remove by key
        student2 = student2 - [school: 'Groovy School'] // This is something like arithmetic operation
         
        println "Student 2 info: ${student2}" // Student 2 info: [name:John, surname:Doe, class:11C]
         
   
        // Map union
        def studentProp1 = [name: 'John', surname: 'Doe']
        def studentProp2 = [age: 17, class: '11C']
        def studentProp3 = [school: 'Groovy School']
        def student4 = studentProp1 + studentProp2 + studentProp3
         
        println "Student 4 ingo: ${student4}" // Student 4 ingo: [name:John, surname:Doe, age:17, class:11C, school:Groovy School]
         
        // Map intersect
        def student5 = [name: 'John', surname: 'Doe', age: 17]
        def student6 = [surname: 'Bunny', age: 17]
        def sameProperties = student5.intersect(student6) // [age: 17]
         
        println "Student 5 - Student 6 intersection: ${sameProperties}" // Student 5 - Student 6 intersection: [age:17]
         
        // Map keys and values
        def student7 = [name: 'John', surname: 'Doe', age: 17]
        def student7KeyList = student7.keySet() // [name, surname, age]
         
        println "Student 7 key set: ${student7KeyList}" // Student 7 key set: [name, surname, age]
         
        def student8 = [name: 'John', surname: 'Doe', age: 17]
        def student8ValueList = student8.values() // [John, Doe, 17]
         
        println "Student 8 value set: ${student8ValueList}" // Student 8 value set: [John, Doe, 17]
    }
 

}