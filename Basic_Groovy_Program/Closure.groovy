//closure method
class Closure{
    static main(args) {
        //create object
        Closure c = new Closure();

        //to call the outer method
        c.outerMethod();
    }
        //to create the outermethod
        def outerMethod(){

                def y=19;

        

                //this is inner method so necessary to use equal to after method name

                def innerMethod={

                    y=10;

                    println(y);

                }
                
            //to call the inner method
            innerMethod();

                println(y);

            }
}
    