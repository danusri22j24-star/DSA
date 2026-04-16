class Solution {
    void selectionSort(int[] arr) {
        // code here
        int mini=0;
        int temp=0;
        for(int i=0;i<arr.length-1;i++){
            mini=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[mini]){
                    mini=j;
                }
            }
            temp=arr[mini];
            arr[mini]=arr[i];
            arr[i]=temp;

        }
    }
}