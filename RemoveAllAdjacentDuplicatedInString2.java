class Solution {

    class Node {
        char ch;
        int count;

        Node(char ch, int count) {
            this.ch = ch;
            this.count = count;
        }
    }

    public String removeDuplicates(String s, int k) {

        Stack<Node> stack = new Stack<>();

        for (char ch : s.toCharArray()) {

            if (!stack.isEmpty() && stack.peek().ch == ch) {
                stack.peek().count++;

                if (stack.peek().count == k) {
                    stack.pop();
                }
            } else {
                stack.push(new Node(ch, 1));
            }
        }

        StringBuilder ans = new StringBuilder();

        while (!stack.isEmpty()) {
            Node curr = stack.pop();

            for (int i = 0; i < curr.count; i++) {
                ans.append(curr.ch);
            }
        }

        return ans.reverse().toString();
    }
}
