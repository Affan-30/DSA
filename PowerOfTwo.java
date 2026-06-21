class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n == 1 || n==2)return true;

        double x = n;
        while(x>2){
            x = x/2;
            
        if(x == 2.0000){
            return true;
        }
        }

        return false;
    }
}
