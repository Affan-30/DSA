public class BubleSort2 {

    public static void main(String[] args) {
        int arr[] = {5,4,3,2,1};
        int n = arr.length-1;
        for(int i=n; i>=0; i--){
            boolean didSwap = false;
            for(int j=0; j<i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    didSwap = true;
                }
            }
            if(!didSwap){
                break;
            }
        }

        for(int x: arr){
            System.out.print(x + " ");
        }
        
    }
}
