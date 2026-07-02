class Main {
    public static void main(String[] args) {
        System.out.println("Start small. Ship something.");
        
        int[] arr = {21,2,3,4,5,1,11,22,9,20};
        
        int largest = Integer.MIN_VALUE;
        int sec = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > largest){
                sec=largest;
                largest =arr[i];
            }else if(arr[i] > sec && arr[i] != largest){
                sec = arr[i];
            }
            
        }
        
         System.out.println(largest);
        System.out.println(sec);
    }
}
