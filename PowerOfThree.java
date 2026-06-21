class Solution {
    public boolean isPowerOfThree(int n) {
         if(n == 1 || n==3)return true;

        double x = n;
        while(x>3){
            x = x/3;
            
        if(x == 3.0000){
            return true;
        }
        }

        return false;
    }
}
