class Solution {
    
    public int fib(int n) {
        // Base Case
        if(n <= 1){
            return n;
        }

        // recursion logic
        return fib(n-1) + fib(n-2);
    }
}
