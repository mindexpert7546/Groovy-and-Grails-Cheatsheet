/**
2.Write a program to check the string is palindrome or not.
*/

class palindromeString{
    static main(args) {

        //String defination is created..... 
        String str = 'abcba';
        

        //declare the empty string for reverse
        String rev = '';

        //logic for reverse string
        for(int i=str.length()-1; i>=0; i--){
            rev+=str[i];
        }

        //condition for palindrome 
        if(str.equals(rev)){
            println("String is a palindrome..");
        }
        else{
            println("String is not a palindrome..")
        }
    }
}