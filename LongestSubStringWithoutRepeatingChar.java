class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() <= 1) return s.length();
        HashSet<Character> set = new HashSet<>();
        set.add(s.charAt(0));
        int i = 0; 
        int j = 1;
        int max = Integer.MIN_VALUE;
        while(j < s.length()){ 
            while(set.contains(s.charAt(j))){
                set.remove(s.charAt(i));
                 i++; 
            }
                 set.add(s.charAt(j)); 
                 j++; 

                 max = Math.max(max, j-i);
        } 
                 

                 return max;
    }
}
