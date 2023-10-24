/**

Arithmetic operators
Relational operators
Logical operators
Bitwise operators
Assignment operators
*/

class GroovyOperators{
    static main(args) {
        //Arithmetic operators
        //+,-,/,*,% this operator is used to find the sum, sub, multi...etc

        int a = 10;
        int b = 12;
        println(a+b);//here it is sum of a and b

        //Relational Operators
        //==,<= etc are relational operator

        //Logical operators
        //&& - it is called and operator if both true
        //|| - it is called or operator if anyone is ture
        //! - it is called not operator if not ture

        //Bitwise operators
        //& - it perform the and operation for binary 
        //| - it perform the or operation for binary
        //~
        //^

        //Assignment operators
        //+=, -+, =, %= etc

        //Range Operator
        //This operator is very important 

        //to define the range 
        def range = 5..10; 
        println(range); //here it will get 5 to 10 value
        println(range.get(2)); 
        

    }
}