class SimpleAddSub{
    static main(args) {
        //Create the object of Scanner class
        Scanner scan = new Scanner(System.in);

        //user message
        println("Enter the first number : ");
        
        //get the number 
        int num1 = scan.nextInt();

        //user message 
        println("Enter the second number : ");

        //get the number 
        int num2 = scan.nextInt();

        //to add the number 
        println("sum : " + num1+num2);

        //to sub the number 
        println("sub : " + num1-num2);

        //to multiply de number
        println("multiply : " + num1*num2);

        //to div de numeber
        println("div : " + num1/num2);

        //to find mod de number 
        println("mod : " + num1%num2);
    }
}