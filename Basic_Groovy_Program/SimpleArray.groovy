class SimpleArray{
    public static void main(args) {

        //Simple Array is created...
       def birds = ["Parrot", "Cockatiel", "Pigeon"] as String[];
       def numbers = [2,3,4,5] as int[];

       //To print the array 
       for(def a:birds){
        print a + " ";
       }
       println();
       for(def a:numbers){
        print a + " ";
       }
    }
}