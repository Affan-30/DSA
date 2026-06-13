class Solution {
    public int mostFrequentEven(int[] nums) {
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(nums[i] %2 == 0){
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
            }
        }
if(map.isEmpty()) return -1;
        int targetValue = Integer.MAX_VALUE;
        Integer freq = Collections.max(map.values());

         for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue().equals(freq)) {
                targetValue = Math.min(targetValue,entry.getKey());
            }
        }

        return targetValue;
    }
}
