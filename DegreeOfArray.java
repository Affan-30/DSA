class Solution {
    public int findShortestSubArray(int[] nums) {

        HashMap<Integer, int[]> map = new HashMap<>();

        int degree = 0;
        int answer = nums.length;

        for (int i = 0; i < nums.length; i++) {

            if (!map.containsKey(nums[i])) {
                map.put(nums[i], new int[]{1, i, i});
            } else {
                int[] data = map.get(nums[i]);

                data[0]++;      // frequency
                data[2] = i;    // last index
            }

            int[] data = map.get(nums[i]);

            degree = Math.max(degree, data[0]);
        }

        for (int[] data : map.values()) {

            if (data[0] == degree) {
                int length = data[2] - data[1] + 1;

                answer = Math.min(answer, length);
            }
        }

        return answer;
    }
}
