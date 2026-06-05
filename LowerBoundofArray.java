class Main {
    public static void main(String[] args) {
        System.out.println("Start small. Ship something.");
        
        int arr[] = {1,22,25,29,31,34 };
        int target = 33;
        int ans = -1;
       
       int s = 0; 
       int e = arr.length-1;
       int mid = (s+e)/2;
       while(s <= e){
           if(arr[mid] >= target){
               ans = mid;
               e = mid-1;
           }else{
               s = mid+1;
           }
           
           mid = (s+e)/2;
       }
        
         System.out.println("Lower bound of "+target+ " is  : "+ans);
    }
}
