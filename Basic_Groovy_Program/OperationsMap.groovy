class OperationsMap{
    public static void main(String[] args){

        //creating defination of the map
        def map = ["groovy":"Grails","java":"framework","git":"github"];

        //insert the data in the map
        map.put("class","work");

        //Insert duplicate key and vlaue
        map.put("groovy","Grails");

        //fetch the data from the map 
        print(map.get("java"));

        //creating minus map here in minusMap except the groovy pairs all paris will visible...
        def minusMap = map.minus(["groovy":"Grails"]);

        //To printing the minusMap map
        println(minusMap);

        // To find the all those key and values which contains eg. value ="Grails" and key="groovy"
       // map.findAll({it.value=="Grails"}.key=="groovy");

       //print the main map 
       println(map);

     /*
     Use1:-
       in mvc same key with different values in groovy map cannot be used
     */

        
    }
}