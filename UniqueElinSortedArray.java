class Main {
    public static void main(String[] args) {
        System.out.println("Start small. Ship something.");
       int arr[] = {1,2,2,2,2,3,3,3,4};
        int n = arr.length;
        int count = 0;
        int i =0 ;
         int j=1;
         
         while(j<=n-1){
             if(arr[i] != arr[j]){
                 System.out.println(i);
                 i++;
                 arr[i] = arr[j];
                 count++;
             }
             j++;
         }
      
            System.out.println("Unique Count : "+(count+1));
            
            for(int b: arr){
                System.out.print(b);
            }
        
    }
}
