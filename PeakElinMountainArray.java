class Main {
    public static void main(String[] args) {
        System.out.println("Start small. Ship something.");
        int arr[] = {1,3,5,6,7,10,14,2,1,0};
        int s =0 ;
        int e = arr.length-1;
        int mid = (s+e)/2;
        int ans = -1;
        while(s <= e){
            if(arr[mid] >= arr[mid + 1]){
                ans = mid;
                e = mid -1;
            }else if  (arr[mid] <= arr[mid + 1]){
                s = mid + 1;
            }
            mid = (s+e)/2;
        }
        
         System.out.println("Peak el found : "+ arr[ans] +" at : "+ans);
        
        // ?Brute Force
        // for(int i=0;i<arr.length-1;i++){
        //     if(arr[i+1] < arr[i] ){
        //         System.out.println("PEaki el found : "+ arr[i] +" at : "+i);
        //         break;
        //     }
        // }
    }
}
