class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> s = new Stack<>();

        for(int i=0; i<operations.length; i++){
            if(operations[i].matches("-?\\d+(\\.\\d+)?")){
                 int number = Integer.parseInt(operations[i]);
                s.push(number);
            }else if(operations[i].equals("+")){
                int a = s.peek();
                int b = s.get(s.size()-2);
                int sum = a+b;
                s.push(sum);
            }else if(operations[i].equals("D")){
                int a = s.peek();
                int d = 2*a;
                s.push(d);
            }else if(operations[i].equals("C")){
                s.pop();
            }
        }

        int sum = 0;

        while(!s.isEmpty()){
            sum += s.pop();
        }

        return sum;
    }
}
