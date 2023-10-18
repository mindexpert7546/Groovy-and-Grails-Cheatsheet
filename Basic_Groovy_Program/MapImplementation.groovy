class MapImplementation{
    public static void main(String[] args){
        def emptyMap = [:]

        //key:value --> map entry
        def map = [name: "Jerry", age: 41, city: "New"] // multiple
        def map1 = [name:"Jerry"] //single entry

        

        map["age"] = 42 //way1
        map.city = "New York"//way2
        def hobbyLiteral = "hobby"

        //hobbyliteral is a placeholder for hobby

        def hobbyMap = [(hobbyLiteral): "Singing",(hobbyLiteral): "dancing"]

        

        map.putAll(hobbyMap)

      //  assertTrue(hobbyMap.hobby == "Singing") // true if condition satisfies
       // assertTrue(hobbyMap[hobbyLiteral] != "Singing") //depends on the condition
        def map2 = [name:"Jerry", age: 42, city: "New York", hobby:"Singing"]
       // assertTrue(map["name"] == "Jerry")
    }
}