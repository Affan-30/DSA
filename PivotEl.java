class Main {
    public static void main(String[] args) {
        System.out.println("Start small. Ship something.");
        int arr[] = {1,7,3,6,5,6};
        int n = arr.length;
        int left[] = new int[n];
        int right[] = new int[n];
        
        left[0] = arr[0];
        for(int i =1; i<n; i++){
            left[i] = arr[i]+left[i-1];
        }
        
        right[n-1] = arr[n-1];
        for(int i =n-2; i>=0 ; i--){
            right[i] = arr[i]+right[i+1];
        }
        
        for(int i =0; i<n; i++){
            if(left[i] == right[i]){
                System.out.println("Pivot index at :"+i); 
                return;
            }
        }
        
        for(int num: left){
            System.out.print(num+" ");
        }
        System.out.println("");
        for(int num: right){
            System.out.print(num+" ");
        }
    }
}
