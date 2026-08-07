class Solution {
    public double myPow(double x, int n) {
        double ans = 1.00000;
        if(n<0){
            int a = -n;
            for(int i=0 ;i<a; i++){
            ans = ans * x;
            }
            return 1/ans;

        }else{
for(int i=0 ;i<n; i++){
            ans = ans * x;
        }
        }
        
        return ans;
    }
}
