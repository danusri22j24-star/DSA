class Solution {
    int lowerBound(int[] arr, int target) {
        // code here
        int mid=0;
        int start=0;
        int end=arr.length-1;
        int ans=arr.length;
        while(start <= end){
            mid=(start+end)/2;
            if(arr[mid] >= target){
                ans=mid;
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return ans;
    }
}