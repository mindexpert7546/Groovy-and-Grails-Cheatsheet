class RemoveDuplicates{

    //method for remove duplicate element
   static def removeDuplicates(arr, n) {
    if (n == 0 || n == 1) {
        return n;
    }

    // To store the index of the next unique element
    def j = 0

    
    // Just maintaining another updated index eg. j
    for (int i = 0; i < n - 1; i++) {
        if (arr[i] != arr[i + 1]) {
            arr[j++] = arr[i];
        }
    }

    arr[j++] = arr[n - 1];

    return j // Return the new length of the array 
}

//method 2 

static def rmD(arr,n){

    //defination of set
    def mySet = arr as Set;

    //convert the arr to list
    arr = arr as List;
    
    //make the empty list
    arr =[];

    //put all value to the list
    arr.addAll(mySet);

    //to convert the list to array
    arr=arr.toArray();
    //to print the arr
    println(arr);
   

    
    
}

    static main(args) {
            def myArray = [1, 2, 2, 3, 4, 4, 5];
            def n = myArray.size();

            def newLength = removeDuplicates(myArray, n);

        // Print the updated array till new length for method first
        for(int i=0; i<newLength; i++){
            print(myArray[i] + " ");
        }

        //to call the second method 
        rmD(myArray,n);
        }
}

