package Stack.LinkedStack;

import java.util.Stack;

public class TestLinkedStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new LinkedStack<>();
        stack.push(4);
        stack.push(55);
        stack.push(333);
        System.out.println(stack);

        stack.pop();
        System.out.println(stack);
    }
}
