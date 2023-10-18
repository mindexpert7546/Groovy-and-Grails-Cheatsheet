class ReverseString{
    static main(args) {
        //function calling for reverse stirng
        String res1 = revString('kundan');

        //to print the result
        println(res1);

        //function calling for reverse number
        int res2 = revNumber(123);

        //to print the result
        println(res2);
    }

    //funtion for reverse the string
    static def revString(String str){
        //string as result
        String rev = '';
        
        //logic for reverse string
        for(int i=str.length()-1; i>=0;i--){
            rev+=str[i];
        }
        return rev;
    }

    //function for reverse number
    static def revNumber(int num) {
        int res = 0;

        //logic for reverse number
        while (num > 0) {
            int mod = num % 10;
            res = res * 10 + mod;
            num /= 10;
        }
        return res;
    }

}