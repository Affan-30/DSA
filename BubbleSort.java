class Main {
    public static void main(String[] args) {
        System.out.println("Start small. Ship something.");
        int arr[] = {1,4,3,2};
        int n = arr.length;
        
        // Striver Soln
        for(int i=n; i>=1; i--){
            int didSwap = 0;
            
            for(int j=0; j<=i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    didSwap = 1;
                }
            }
            if(didSwap == 0)break;
        }
        
        // Codehelp by babbar Soln
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-i-1; j++){
                 if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        
        
        for(int i : arr){
            System.out.print(i + " ");
        }
    }
}
