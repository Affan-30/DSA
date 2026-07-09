class Solution {
    public int thirdMax(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for(int n : nums){
            set.add(n);
        }

        if(set.size() <= 2){
            return Collections.max(set);
        }else{
            for(int i=0; i<2; i++){
                set.remove(Collections.max(set));
            }
             return Collections.max(set);
        }
    }
}
