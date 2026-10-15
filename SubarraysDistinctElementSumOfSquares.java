class Solution {
    public int sumCounts(List<Integer> nums) {
        int n = nums.size();
        ArrayList<Integer> dv  = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();

         for (int i = 0; i < n; i++) {
            // 'j' marks the ending boundary of the subarray
            for (int j = i; j < n; j++) {
                
                // 'k' iterates and prints elements from i to j
                for (int k = i; k <= j; k++) {
                    set.add(nums.get(k));
                }
                dv.add(set.size());
                set.clear();
            }
        }

        int sum = 0;
        for(int i=0; i<dv.size(); i++){
            int no = dv.get(i);
            sum += no*no;
        }

        return sum;
    }
}
