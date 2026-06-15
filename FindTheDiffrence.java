class Solution {
    public char findTheDifference(String s, String t) {
         int[] chars = new int[26];

        for(int i=0 ; i<t.length(); i++){
            char ch = t.charAt(i);
            chars[ch - 'a']++;
        }
        
        for(int i=0 ; i<s.length(); i++){
            char ch = s.charAt(i);
            chars[ch - 'a']--;
        }
        
        int ans = 0;
        for(int i=0; i<chars.length; i++){
            if(chars[i] == 1){
                ans = i + 'a';
            }
        }
        
        char ch = (char)ans;
        return ch;
    }
}
