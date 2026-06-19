class Solution {
    public int compress(char[] chars) {
        if(chars.length < 2){
            return chars.length;
        }
        StringBuilder str = new StringBuilder();
        int i = 1;
        char ch = chars[0];
        int freq = 1;

        while(i < chars.length){
            if(chars[i] != ch){
                str.append(ch);
                if(freq>1){
                    str.append(freq);
                }
                ch = chars[i];
                freq = 1;
            }else{
                freq++;
            }
            i++;
        }
          str.append(ch);
        if(freq>1){
                    str.append(freq);
                }

                for(int k=0 ;k < str.length(); k++){
                    char chr = str.charAt(k);
                    chars[k] = chr;
                }

        return str.length();
    }
}
