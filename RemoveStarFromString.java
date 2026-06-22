class Solution {
    public String removeStars(String s) {
        StringBuilder str  = new StringBuilder();
        Deque<Character> stack = new ArrayDeque<>();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '*'){
                stack.pop();
            }else{
                stack.push(ch);
            }
        }

        while(!stack.isEmpty()){
            char ch = stack.pop();
            str.append(ch);
        }

        str.reverse();
        return str.toString();
    }
}
