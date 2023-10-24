class Looping{
    static main(args) {
        //while loop
        //to print the 1 to 5 using the while loop

        //message 
        println("While loop -> ")
        int i=1;
        while(i<=5){
            println(i);
            i++;
        }

        //for loop
        //to print the 1 to 5 using for loop
        //message
        println("For loop -> ")
        for(int j=1; j<=5; j++){
            println(j);
        }

        //Groovy - for-in statement
        //message 
        println("Groovy - for-in statement : ");
        for(int k in 1..5){
            println(k);
        }

        println("eg. 2 : ");
        def employee = ["Ken" : 21, "John" : 25, "Sally" : 22];
		
        for(emp in employee) {
            println(emp);
        }
    }
}