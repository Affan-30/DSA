class Solution {
    public boolean isPalindrome(String s) {
        String a  = s.replaceAll("[^a-zA-Z0-9]", "");
        String og = a.toLowerCase();
System.out.println(og);
if(og.length() <= 1)return true;

        int i =0;
        int j =og.length()-1;
        while(i<=j){
            if(og.charAt(i) != og.charAt(j)){
                return false;
            }
            i++;
            j--;
        }

        return true;
    }
}
