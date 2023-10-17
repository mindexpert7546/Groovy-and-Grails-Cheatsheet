class ReverseString{
    public static void main(String[] args){
        
        //creating a string defination
        String str = "groovy";

        //creating empty string for store the reverse result
        String rev = '';

        //logic for reverse the string
        for(int i=str.length()-1; i>=0; i--){
         rev+=str[i];
        }

        //printing the result as reverse string
        print(rev);

    }
}