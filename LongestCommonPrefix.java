class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        String ex = strs[0] ;

        if(ex.length() == 0)return ex;
        
        for(int i=0; i<ex.length(); i++){
            char ch = ex.charAt(i);
            
            for(int j=0; j<strs.length; j++){
                String temp = strs[j];
                if(i == temp.length() || temp.charAt(i) != ch ){
                    return ex.substring(0, i);
                }
            }
        }

        return ex;
    }
}
