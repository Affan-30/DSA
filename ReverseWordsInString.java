class Solution {
    public String reverseWords(String s) {
        StringBuilder ans = new StringBuilder();

        int i = s.length()-1;
        while(i >= 0){
            // Ignore all trailing spaces
            while(i >= 0 && s.charAt(i) == ' '){
                i--;
            }

            if(i < 0){
                return ans.toString();
            }
            int j =i;
            while(j >= 0 && s.charAt(j) != ' '){
                j--;
            }

            
            // add space if the word is not first word of string
            if(ans.length() > 0){
               ans.append(' ');
            }
           // Word found
           ans.append(s.substring(j+1, i+1));

            
            // Increment counters
            j--;
            i = j;
        }

        return ans.toString();
    }
}
