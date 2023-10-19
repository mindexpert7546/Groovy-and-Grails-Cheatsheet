class ArrayDefination{

    static main(args) {

       

        //array defination created

        def birds = new String[5];

 

        //to insert the value in array

        //by using direct index

        birds[0]='Parrot';

 

        //by using putAt() method

        birds.putAt(4,'abc');

        birds.putAt(2,'cdd');

 

        //print the array

        println(birds);

 

        //array defination and initilization

        def numbers = [12,45,7,5,3,45] as int[];

 

        //method 1 to update value

        numbers[1]=40;

 

        //method 2 to update value

        numbers.putAt(3,345);

 

        //to print the array

        println(numbers);

 

        //get the value by index

        println(numbers[-2]);

        //method 2 to get value

        println(numbers.getAt(2));

 

        //it will print MissingMethodexception

       // numbers << 3456;

 

       //to get size or length of array

       println(numbers.size()); //method 1

       println(numbers.length); //method 2

 

       //to find the max number

       println numbers.max();

 

       //to find the min number

       println numbers.min();

 

       //defination of array string

       def str = ['abcsdefa','adfksds','adfksdz','adfksd','ad','ad','Cockatiel'];

 

       println(str.max{it.size()});//abcsdef

       println str.max(); //considered last assci value of each element

       println str.min();

 

       str = str-'adfksds';

       str=str.minus('ad');

     

       

       println(str.size());

       println(str.sort());

       println(str.reverse());

       println(numbers.reverse());

 

       // array defination but it contains list property

       def lst = [13, 12, 15, 14];

      def newlst = lst.sort();

      println(newlst);

 

      println (str.collect{it.reverse()});

 

       def founded = str.find { it =~ /Cockatiels/ };//if founded means return that same value otherwise return null

       def founde =numbers.find{it=~1255};//for number / sles is not needed.

 

       println founded;

       println founde;

 

 

 def bird = ["Parrot", "Cockatiel", "Pigeon"] as String[]

         

        def birdList = bird.toList()

         

        println birdList.class.name // java.util.ArrayList

         

        def birdsAgain = birdList as String[]

         

        println birdsAgain.class.name // [Ljava.lang.String;

    }

}