import java.util.*;
class Main {
    public static void main(String[] args) {
        System.out.println("Start small. Ship something.");
        int[][] arr = {
        {1,2,3},
        {1,2,4},
        {1,2,5}};
        
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0 ; i<arr.length; i++){
            int sum =0;
            for(int j=0 ; j<arr[0].length; j++){
                // imp step to print col sum 
            sum += arr[j][i];
        }
        list.add(sum);
        }
        
        for(int i : list){
            System.out.print(i+" ");
        }
    }
}
