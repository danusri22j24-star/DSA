public int getSecondLargest(int[] arr) {
    // code here
    int largest=0;
    int secondLargest=0;

    for(int i=0;i<arr.length;i++){
        if(arr[i]>largest){
            secondLargest=largest;
            largest=arr[i];
        }
        else if(arr[i]<largest && arr[i]>secondLargest){
            secondLargest=arr[i];
        }
    }
    if(largest==secondLargest){
        return -1;
    }
    else{
        return secondLargest;
    }
}