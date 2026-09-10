class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int n : nums){
            map.put(n, map.getOrDefault(n, 0)+1);
        }

        Integer[] arr = new Integer[nums.length];

        for (int i = 0; i < nums.length; i++) {
            arr[i] = nums[i];
        }

        Arrays.sort(arr, (a, b) -> {

            // Lower frequency comes first
            if (!map.get(a).equals(map.get(b))) {
                return map.get(a) - map.get(b);
            }

            // Same frequency -> larger number comes first
            return b - a;
        });

        // Step 3: Convert Integer[] back to int[]
        for (int i = 0; i < nums.length; i++) {
            nums[i] = arr[i];
        }

return nums;
    }
}
