class Solution {
    public boolean areOccurrencesEqual(String s) {
        int freq[] = new int[26];
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            // if(freq[ch - 'a'] < 1){
                freq[ch - 'a']++;
            // } 
        }

int j = 0;
while(freq[j] == 0){
    j++;
}
int common = freq[j];
        for(int i=0; i<freq.length; i++){
            if(freq[i] !=0 && freq[i] != common){
                return false;
            }
        }
return true;
    }
}
