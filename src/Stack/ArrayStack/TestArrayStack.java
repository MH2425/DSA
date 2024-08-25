package Stack.ArrayStack;

import java.util.Stack;

public class TestArrayStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new ArrayStack<>();
        stack.push(5);
        stack.push(3);
        System.out.println(stack);

        System.out.println(stack.size());
        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println(stack.isEmpty());

        stack.push(66);
        System.out.println(stack);

        stack.pop();
        System.out.println(stack);
    }
}
