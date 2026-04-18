class Solution {
    public void rotate(int[] nums, int k) {
        while(k>0) {
            int last = 0;
            for (int i = 0; i <= k; i++) {
                last = nums[nums.length - 1];
                break;
            }
            for (int j = nums.length - 1; j > 0; j--) {
                nums[j] = nums[j - 1];
            }
            nums[0] = last;
            k=k-1;
        }
    }
}