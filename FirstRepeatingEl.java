import java.util.*;
class Main {
    public static void main(String[] args) {
        System.out.println("Start small. Ship something.");
       int arr[] = {1,2,3,4,5,6,7,4,3,1};
        int n = arr.length;
         
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<n; i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        for(int i=0; i<n; i++){
           if(map.get(arr[i]) > 1){
               System.out.println("First Reapeating el is : "+arr[i]);
               break;
           }
        }
            
           System.out.println(map);
        
    }
}
