class Solution {
    public int smallestIndex(int[] nums) {
        for(int i=0; i<nums.length; i++){
            if(nums[i] < 10){
                if(nums[i] == i){
                    return i;
                }
            }else{
                int sum = extractDigit(nums[i]);
                if(sum == i){
                    return i;
                }
            }
        }

        return -1;
    }

    public static int extractDigit(int n){
        int sum = 0;
        while(n > 0){
            sum += n%10;

            n = n/10;
        }
        return sum;
    }
}
