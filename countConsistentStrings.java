class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        HashSet<Character> set = new HashSet<>();
        int count = words.length;
        for(char ch : allowed.toCharArray()){
            set.add(ch);
        }
        for(int i=0 ; i< words.length; i++){
            String temp = words[i];
            int j =0;
            while(j < temp.length()){
                if(! set.contains(temp.charAt(j))){
                    count--;
                    break;
                }
                j++;
            }
          
        }

        return count;
    }
}
