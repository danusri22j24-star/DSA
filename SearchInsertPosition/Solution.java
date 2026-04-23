class Solution {
    public int searchInsert(int[] nums, int target) {
        int mid=0;
        int start=0;
        int end=nums.length-1;
        int ans=0;
        int last=nums.length;
        while(start<=end){
            mid=(start+end)/2;
            if(nums[mid]>=target){
                ans=mid;
                end=mid-1;
            }
            else if(target>nums[last-1]){
                return last;
            }
            else{
                start=mid+1;
            }

        }
        return ans;
    }
}