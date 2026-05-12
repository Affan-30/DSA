class Main {
    public static void main(String[] args) {
        int arr[] = {2,3,4,3,4,5,5,2,1};
        int xor = 0;
        for(int i : arr){
            xor = xor ^ i;
        }
        System.out.println("Unique no. (Non repeating) is : "+xor);
    }
}
