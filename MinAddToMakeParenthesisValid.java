class Solution {
    public int minAddToMakeValid(String s) {
        //  if(s.length() <2)return false;
        Stack<Character> stack = new Stack<>();
        int count =0 ;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{'){
                stack.push(s.charAt(i));
            }else if(s.charAt(i) == ')'){
                if(!stack.isEmpty() &&  stack.peek() == '('){
                  stack.pop();
                }else {
                     stack.push(s.charAt(i));
                    count++;
                }
            //    return false;
            }else if(s.charAt(i) == ']'){
                if(!stack.isEmpty() &&  stack.peek() == '['){
                  stack.pop();
                }else {
                     stack.push(s.charAt(i));
                     count++;
                }
            //    return false;
            }else if(s.charAt(i) == '}'){
            if(!stack.isEmpty() &&  stack.peek() == '{'){
                  stack.pop();
                }else {
                     stack.push(s.charAt(i));
                     count++;
                }
            //    return false;
            }
        }
        return stack.size();
    }
}
