/**
3.Write a program that will show weather de person is having de age greater than 18 or not through user input
*/

class PersonAge{

    static main(args) {
        //create the object for scanner class
        Scanner scan = new Scanner(System.in);

        println("Enter the age : ");

        //take the input as int
        int age = scan.nextInt();
        
        //to verify age
        if(age>18){
            println("Age is greater than 18...");
        }
        else{
            println("Age is less than 18....")
        }
    }
}