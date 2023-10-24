class Ranges{
    static main(args) {
        //defination of range variable by using def as int
        def range = 1..10;

        //contains method 
        println(range.contains(2));//true
        println(range.contains(22));//false

        //get method
        println(range.get(2));//value of index 2 will be print which is 3

        //get  getFrom() method
        println(range.getFrom()); //statring value of range will be print which is 1

        //get getTo() method
        println(range.getTo());//end value of range will be print which is 10

        //isReverse() method

        println(range.isReverse());//false 

        //size method
        println(range.size()); //10 will be print

        //aubLiar() method 
        println(range.subList(2,5)); //3,4,5
    }
}