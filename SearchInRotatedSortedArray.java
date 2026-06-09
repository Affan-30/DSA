class Main {
     public static int findMin(int[] arr) {
        int n = arr.length-1;
        int s =0; 
        int e = n-1;
        int ans = -1;
        int mid = -1;
        
        while(s <= e){
            mid = (s+e)/2;
            if(arr[mid] > arr[n]){
                ans = mid;
                s = mid+1;
            }else if (arr[mid] < arr[n]){
               e = mid-1;
            }
        }

         return ans;
    }
    public static int search(int[] nums, int target) {
        int n = nums.length-1;
        if(nums.length == 1){
    return nums[0] == target ? 0 : -1;
}
        int s = 0;
        int e = nums.length-1;
        int mid = -1;

        int pivot = findMin(nums);
        System.out.println("pivot at : "+pivot);
        if(pivot == -1){
        s = 0;
        e = nums.length-1;
        }else
        if(target >= nums[0] && target <= nums[pivot]){
            s = 0;
            e = pivot;
        }else{
            s = pivot+1;
            e = n;
        }
        
        while (s <= e) {
            mid = s + (e - s) / 2;

            if (nums[mid] == target) {
                return mid;
            } 
            else if (nums[mid] > target) {
                e = mid - 1;
            } 
            else {
                s = mid + 1;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        
        int arr[] = {3,5,1};
        int target = 3;
        
        int ans = search(arr, target);
        System.out.println("Found at : "+ans);
    }
}
