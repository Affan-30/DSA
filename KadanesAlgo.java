class Main {
    public static void main(String[] args) {
        int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        
        for(int i=0; i<arr.length; i++){
          // Step 1
            sum = sum+arr[i];
          // Step 2
          maxSum = Math.max(sum, maxSum);
          // Step 3
            if(sum<0){
                sum =0;
            }
          
        }
         System.out.println("Max Subarray sum : "+maxSum);
    }
}
