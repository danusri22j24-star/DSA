class Solution {
    public int search(int[] nums, int target) {
        int mid=0;
        int end=nums.length-1;
        int start=0;
        while(start<=end){
            mid=(start+end)/2;
            if(nums[mid]>target){
                end=mid-1;
            }
            if(nums[mid]<target){
                start=mid+1;
            }
            if(nums[mid]==target){
                return mid;
            }
        }
        return -1;
    }
}