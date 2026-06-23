class Solution {
    public int lengthOfLastWord(String s) {
       
        String str = s.strip();

         if(str.length() <=1)return str.length();

        int j = str.length()-1;
        
        int last = j;
        while(j >= 0 && str.charAt(j) != ' '){
            j--;
        }
        int first = j;

        return last - first;
    }
}
