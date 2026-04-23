class Solution {
    public int findCeil(int[] arr, int x) {
        // code here
        int mid=0;
        int start=0;
        int end=arr.length-1;
        int ans=0;
        int last=arr.length;
        while(start<=end){
            mid=(start+end)/2;
            if(arr[mid]>=x){
                ans=mid;
                end=mid-1;
            }
            else if(x>arr[last-1]){
                return -1;
            }
            else{
                start=mid+1;
            }
        }
        return ans;
    }
}
