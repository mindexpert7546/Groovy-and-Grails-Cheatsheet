class LargestNo_Array{
    public static void main(String[] args){
        //To create the array
        int[] arr = [1,6,3,7,4,9,23,4,65,98];

        //logic for find largest number from the array 
        int res =arr[0];
        for(int a:arr){
            if(res<a){
                res = a;
            }
        }
    
    println(res);

    }
}