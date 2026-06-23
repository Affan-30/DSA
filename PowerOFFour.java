class Solution {
    public boolean isPowerOfFour(int n) {
        if(n == 1 || n==4)return true;

        double x = n;
        while(x>4){
            x = x/4;
            
        if(x == 4.0000){
            return true;
        }
        }

        return false;
    }
}
