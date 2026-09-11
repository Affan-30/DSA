class Solution {
    public int mostFrequent(int[] nums, int key) {

        HashMap<Integer, Integer> map = new HashMap<>();

        int answer = 0;
        int maxFrequency = 0;

        for (int i = 0; i < nums.length - 1; i++) {

            if (nums[i] == key) {

                int next = nums[i + 1];

                map.put(next, map.getOrDefault(next, 0) + 1);

                if (map.get(next) > maxFrequency) {
                    maxFrequency = map.get(next);
                    answer = next;
                }
            }
        }

        return answer;
    }
}
