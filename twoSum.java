import java.util.*;
class Main {
    public static void main(String[] args) {
        System.out.println("Start small. Ship something.");
        int arr[] = {7,1,11,23,2};
        int target = 9;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(7, 0);
        for(int i =1; i<arr.length; i++){
            int x = target - arr[i];
            if(map.containsKey(x)){
             System.out.println("Two Sum Found : "+map.get(x)+" , "+i); 
             return;
            }
            map.put(arr[i] , i);
        }
    }
}
