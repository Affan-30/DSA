class Main {
    public static void main(String[] args) {
        System.out.println("Start small. Ship something.");
        int arr[] = {1,4,3,2};
        int n = arr.length;
        
        for(int i=0 ; i<n-2; i++){
            int min = i;
            for(int j=i+1; j<n; j++){
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[ min ];
            arr[min] = temp;
        }
        
        
        for(int i : arr){
            System.out.print(i + " ");
        }
    }
}
