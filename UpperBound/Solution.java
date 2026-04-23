class Solution {
    int upperBound(int[] arr, int target) {
        // code here
        int mid=0;
        int start=0;
        int end=arr.length-1;
        int ans=arr.length;
        while(start <= end){
            mid=(start+end)/2;
            if(arr[mid] <= target){
                ans=mid;
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return ans+1;
    }
}
