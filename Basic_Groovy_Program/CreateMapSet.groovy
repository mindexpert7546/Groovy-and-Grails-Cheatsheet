/**
 Create a Map and set and explain the difference between them in Groovy/grails

 Difference between Map and Set in Groovy:
 Map :- 1.It contains Key and value pairs, 2.Key always should be unique. 3.If we insert the same value in key then last value will be consider
 Set :- 1.It contains only one unique value. 3.It representing the distinguish element..

 Notes - By the way in map key representing the set functionality....


*/

class CreateMapSet{
    static main(args) {
        //create map defination
        def map =[name1:'user1',name2:'user2',name3:'user3',name4:'user4',name5:'user5'];

        //to print the set
        println map;

        //create set defination
        def mySet = [1, 2, 3, 4, 5,5] as Set;

        //to print the set 
        println mySet;
    }
}