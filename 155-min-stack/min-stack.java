import java.util.Stack;

class MinStack {
    private Stack<Node> stack;

    private static class Node {
        int val;
        int min;

        Node(int val, int min) {
            this.val = val;
            this.min = min;
        }
    }

    public MinStack() {
        stack = new Stack<>();
    }
    
    public void push(int val) {
        if (stack.isEmpty()) {
            stack.push(new Node(val, val));
        } else {
            int currentMin = Math.min(val, stack.peek().min);
            stack.push(new Node(val, currentMin));
        }
    }
    
    public void pop() {
        stack.pop();
    }
    
    public int top() {
        return stack.peek().val;
    }
    
    public int getMin() {
        return stack.peek().min;
    }
}