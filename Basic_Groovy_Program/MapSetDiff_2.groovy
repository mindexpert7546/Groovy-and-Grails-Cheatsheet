/**
2. Write a program that will demonstrate the difference between the set and map
*/

class MapSetDiff_2{
    static main(args) {
        // Creating the defination of  a set
        def mySet = [1, 2, 3, 4, 5] as Set

        // Creating the defination of a map
        def myMap = [a: 1, b: 2, c: 3, d: 4, e: 5]

        // Printing the set 
        println("Set:")
        for(def a:mySet){
            println a;
        }

        // Printing the map dictionay
        println("\nMap:")
        myMap.each { key, value ->
            println("$key -> $value")
        }

    }
}