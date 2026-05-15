import java.util.*;
class Main {
    public static void main(String[] args) {
        System.out.println("Start small. Ship something.");
        int arr[] = {1,4,4,5,2,2};
        int n = arr.length;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i< n; i++){
            int value = Math.abs(arr[i]);
            int pos = value - 1;
            if(arr[pos] > 0){
               arr[pos]  =  -arr[pos];
            }
            }
          
          for(int i=0; i< n; i++){
              if(arr[i] > 0){
                  list.add(i+1);
              }
          }
        
        
        for(int num : arr){
            System.out.print(num + " ");
        }
         System.out.println();
         System.out.println("Missing Elements in the Duplicate array are : ");
        for(int num : list){
            System.out.print(num + " ");
        }
}
}
