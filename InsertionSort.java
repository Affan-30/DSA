class Main {
    public static void main(String[] args) {
        System.out.println("Start small. Ship something.");
        int arr[] = {1,4,3,2};
        int n = arr.length;
        
        for(int i=1; i<n;i++){
            int j = i;
            while(j>0 && arr[j-1] > arr[j]){
                  int temp = arr[j];
                  arr[j] = arr[ j-1 ];
                  arr[j-1] = temp;
                  j--;
            }
        }
        
        for(int i : arr){
            System.out.print(i + " ");
        }
    }
}
