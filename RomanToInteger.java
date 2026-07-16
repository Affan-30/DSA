class Solution {
    public int romanToInt(String s) {
        char[] rom = {'I', 'V', 'X', 'L', 'C', 'D', 'M'};
        int[] val = {1,5,10,50,100,500,1000};
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i<rom.length; i++){
            map.put(rom[i], val[i]);
        }

int ans = 0;

        for(int i=0; i<s.length()-1; i=i+1){
            char ch = s.charAt(i);
            char next = s.charAt(i+1);
           
            if(map.get(ch) < map.get(next)){
                ans += - map.get(ch);
                
            }else{
                ans += map.get(ch);
            }            
        }

        ans += map.get(s.charAt(s.length()-1));

        return ans;
    }
}
