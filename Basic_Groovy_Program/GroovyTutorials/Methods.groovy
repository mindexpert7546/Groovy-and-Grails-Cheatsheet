class Method{
    static main(args) {

        //method calling
        method1();

        //to create the object for the BasicMethod class
        Method bm = new Method();
        bm.setY(10);
        println(bm.getY());

    }

    //To define the simple method 
    static def method1(){
        println "Hello";
        println "Groovy";
        println "Grails";

    }

    //To define the instance method 

    //to define the instance variable
    int y;

    //getter
    public int getY(){
        return y;
    }

    //setter
    public void setY(int py){
        y=py;
    }
    
}