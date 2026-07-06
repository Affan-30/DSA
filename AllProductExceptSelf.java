public class AllProductExceptSelf {
    public static int[] productExceptSelf(int[] nums) {
        int ans[] = new int[nums.length];
        int res = 1;
        for(int i=0; i<nums.length; i++){
            res= 1;
            for(int j=0; j<nums.length; j++){
                if(j == i){
                    continue;
                }
                res = res * nums[j];
            }
            ans[i] = res;
        }

        return ans ;
    }

    public static int[] ON(int[] nums){
        int prefix[] = new int[nums.length];
        prefix[0] = 1;
        int suffix[] = new int[nums.length];
        suffix[suffix.length-1] = 1;
        int answer[] = new int[nums.length];

        for(int i=1; i<nums.length; i++){
            prefix[i] = prefix[i-1] * nums[i-1];
        }
        for (int i = nums.length - 2; i >= 0; i--){
            suffix[i] = suffix[i+1] * nums[i+1];
        }
        for(int i=0; i<nums.length; i++){
            answer[i] = prefix[i] * suffix[i];
        }
        return answer;
    }
    public static void main(String[] args) {
        int nums[] = {-1,0,1,2,3};
        int ans[] = productExceptSelf(nums);
        int ans2[] = ON(nums);
        for(int answer : ans){
            System.out.print(answer+ " ");
        }
        System.out.println();
        for(int answer : ans2){
            System.out.print(answer+ " ");
        }
    }
}
