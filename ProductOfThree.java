
class Solution {
    public int maximumProduct(int[] nums) {
        int n = nums.length-1;
        Arrays.sort(nums);

        return nums[n] * nums[n-1] * nums[n-2];
    }
}
