 int arr[] = {0,2,4,1,5};
        int n = -1;
        for(int i : arr){
            n = Math.max(i, n);
        }
        int sum = n*(n+1)/2;
        int sum2 =0 ;
        for(int i : arr){
            sum2 += i;
        }
        int x = sum-sum2;
        System.out.println("Misiing no. is : "+x);
