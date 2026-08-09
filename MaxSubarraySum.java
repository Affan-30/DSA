// Sliding Window Approach

class Solution{
  public static int maxSum(int n[], int k){
    int wSum = 0;
    int mSum = Integer.MIN_VALUE;

    for(int i=0; i<k ;i++){
      wSum = wSum + n[i];
    }

    for(int i=k; i<n.length; i++){
      wSum = wSum - n[i-k] + n[i];
      mSum = Math.max(mSum , wSum);
    }

    return mSum;
  }
}
