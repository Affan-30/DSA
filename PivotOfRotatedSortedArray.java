class Main {
    public static void main(String[] args) {
        System.out.println("Start small. Ship something.");
        int arr[] = {50,60,70,80,5,10,20,30,40,45};
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
        
        System.out.println("Pivot of rotated sorted array is : "+ans);
    }
}
