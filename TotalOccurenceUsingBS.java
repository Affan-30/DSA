class Main {
    public static void main(String[] args) {
        System.out.println("Start small. Ship something.");
        
        int arr[] = {1,22,25,29,33,33,33,33,33,31,34 };
        int target = 33;
        int lower = -1;
        int upper = -1;
       
       int s = 0; 
       int e = arr.length-1;
       
        while(s <= e){
             int mid = (s+e)/2;
           if(arr[mid] >= target){
               lower = mid;
               e = mid-1;
           }else{
               s = mid+1;
           }
       }
       
       s =0; 
       e = arr.length-1;
       while(s <= e){
           int mid = (s+e)/2;
           if(arr[mid] <= target){
               upper = mid;
               s = mid+1;
           }else{
               e = mid-1;
           }
       }
        
         System.out.println("Lower bound of "+target+ " is  : "+lower);
         System.out.println("Upper bound of "+target+ " is  : "+upper);
         int total = upper - lower;
         System.out.println("Total occurence of "+target+ " is  : "+total);
    }
}
