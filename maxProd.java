class Solution {
    public int maxProduct(int n) {
        if(n < 100){
            int sum = 1;
            while(n > 0){
                int dig = n%10;
                sum *= dig;
                n = n/10;
            }

            return sum;
        }

        ArrayList<Integer> list = new ArrayList<>();
        int largest = Integer.MIN_VALUE;
        int sec = 0;

        while(n > 0){
            int dig = n%10;     
            list.add(dig);
            n = n/10;
        }

        Collections.sort(list);

        return list.get(list.size()-1) * list.get(list.size()-2);
    }
}
