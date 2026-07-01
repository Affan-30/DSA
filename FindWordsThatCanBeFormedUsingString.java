class Solution {
    public int countCharacters(String[] words, String chars) {
        int[] freq = new int [26];
        int count = 0;
        for(int i=0; i<chars.length(); i++){
            char ch = chars.charAt(i);
            freq[ch - 'a']++;
        }

        for(int i=0; i<words.length; i++){
             int[] tempFreq = freq.clone();
            String temp = words[i];
            boolean isInclude = true;

            for(int j=0; j<temp.length(); j++){
            char ch = temp.charAt(j);
            if(tempFreq[ch - 'a'] > 0){
                 tempFreq[ch - 'a']--;
            }else{
                isInclude = false;
                break;
            }
            }

            if(isInclude){
                count += temp.length();
            }
        }

        return count;
    }
}
