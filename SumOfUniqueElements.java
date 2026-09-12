class Solution {
    public int sumOfUnique(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequency of each number
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Add only numbers having frequency 1
        int sum = 0;

        for (int num : nums) {
            if (map.get(num) == 1) {
                sum += num;
            }
        }

        return sum;
    }
}
