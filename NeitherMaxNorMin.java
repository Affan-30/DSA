class Solution {
    public int findNonMinOrMax(int[] nums) {
        if(nums.length <= 2)return -1;

        int max = Arrays.stream(nums)
                        .max()
                        .getAsInt();

        int min = Arrays.stream(nums)
                        .min()
                        .getAsInt();

                        for(int i =0 ; i<nums.length; i++){
                            if(nums[i] != max && nums[i] != min){
                                return nums[i];
                            }
                        }

                        return -1;
    }
}
