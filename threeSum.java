import java.util.*;
class Main {
    public static void main(String[] args) {
        System.out.println("Start small. Ship something.");
        HashSet<List<Integer>> ans = new HashSet<>();
        int arr[] = {-1,0,1,2,-1,4};
        int target = 0;
        int n = arr.length;
        for(int i=0; i<n-2; i++){
            for(int j=i+1; j<n-1; j++){
               for(int k=j+1; k<n; k++){
            if(arr[i] + arr[j] + arr[k] == target){
                ArrayList<Integer> temp = new ArrayList<>();
                temp.add(arr[i]);
                temp.add(arr[j]);
                temp.add(arr[k]);
                Collections.sort(temp);
                ans.add(temp);
            }
        }
        }
        }
        
        for(List<Integer> i : ans){
            System.out.print(i + " ");
        }
    }
}
