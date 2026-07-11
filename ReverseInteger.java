class Solution {
    public int reverse(int x) {
        if(x == 0)return 0;
        StringBuilder str = new StringBuilder(String.valueOf(x));
        str.reverse();

        while(str.charAt(0) == '0'){
            str.deleteCharAt(0);
        }

        if(str.charAt(str.length()-1) == '-'){
            str.deleteCharAt(str.length()-1);
            str.insert(0, '-'); 
        }
        long temp = Long.parseLong(str.toString());
        if(temp > 2147483647 || temp < -2147483647){
            return 0;
        }else{
            int result = Integer.parseInt(str.toString()); 
            return result;
        }
    }
}

// TC : O(log n) & SC : O(1)
class Solution {
    public int reverse(int x) {
        int rev = 0;

        while (x != 0) {
            int digit = x % 10;

            if (rev > Integer.MAX_VALUE / 10 ||
                rev < Integer.MIN_VALUE / 10) {
                return 0;
            }

            rev = rev * 10 + digit;
            x /= 10;
        }

        return rev;
    }
}
