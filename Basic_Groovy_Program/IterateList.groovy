
/**

Write a program using Groovy to iterate over a list and print the result in another list. 

*/
class IterateList{
    public static void main(String[] args){

        //Defination of the list 
        def myList = [1, 2, 3, 4];
        def outputmyList = myList.collect { item -> [item] };

        //output 
        for(def e:outputmyList){
            print(e);
        }

        //for next line 
        println();
        
        //other method to print 
        outputmyList.each { println it };
    }
}