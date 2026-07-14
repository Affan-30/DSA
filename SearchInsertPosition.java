class Solution {
    public int searchInsert(int[] nums, int target) {
        int l = 0;
        int r = nums.length-1;

        int mid =  (l + r)/2;

        while(l <= r){
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] < target){
                l = mid+1;
            }else{
                r = mid-1;
            }

            mid = (l+r)/2;
        }
            
            if(target < nums[0]){
                return 0;
            }else if(target > nums[nums.length-1]){
                return nums.length;
            }
            for(int i=0; i<nums.length; i++){
                if(nums[i] == target-1){
                    return i+1;
                }else if (nums[i] == target+1){
                    return i;
                }
            }
        

        return mid;
    }
}
