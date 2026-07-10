class Solution {
    public String compressedString(String word) {
        StringBuilder str = new StringBuilder();
         int count = 1; 
         for(int i =1; i<word.length(); i++){ 
            if(word.charAt(i) == word.charAt(i-1) && count < 9){ 
                count++; 
            }else{ 
                str.append(count); 
                str.append(word.charAt(i-1)); 
                 
                        count= 1; 
                } 
        }
        str.append(count);
        str.append(word.charAt(word.length()-1));

        return str.toString();
    }
}
