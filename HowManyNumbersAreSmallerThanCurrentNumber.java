class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {

        int copy[] = nums.clone();
        int n = copy.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        Arrays.sort(copy);

       
        for(int i = 0; i < copy.length; i++) {
            if(!map.containsKey(copy[i])) {
                map.put(copy[i], i);
            }
        }

       for(int i = 0; i < nums.length; i++){
    nums[i] = map.get(nums[i]);
}
        return nums;
    }
}
