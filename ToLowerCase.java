class Solution {
    public String toLowerCase(String s) {
        StringBuilder str = new StringBuilder("");
        for(int i=0; i<s.length(); i++){
            if(Character.isUpperCase(s.charAt(i))){
                char upper = s.charAt(i);
                char lower = (char) (upper + 32);
                str.append(lower);
            }else{
                str.append(s.charAt(i));
            }
        }
        
        return str.toString();
    }
}
