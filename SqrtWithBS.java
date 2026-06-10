class Solution {
    public int mySqrt(int n) {
        if(n==0)return 0;
        int s =1; 
        int e = n;
        int mid = s+ (e-s)/2;
        int ans = -1;
        
        while(s <= e){
            if(mid == n/mid){
                return mid;

            }else if (mid > n/mid){
            e = mid -1;
            }else{
            ans =mid;
            s = mid+1;
        }
        mid = (s +e)/2;
    }

    return ans;
    }
}
