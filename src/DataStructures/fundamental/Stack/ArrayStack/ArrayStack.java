package DataStructures.fundamental.Stack.ArrayStack;

import java.util.Stack;

public class ArrayStack<E> extends Stack<E> {
    public static final int CAPACITY = 1000;
    private E[] data;
    private int t = -1;
    public ArrayStack() {
        this(CAPACITY);
    }

    public ArrayStack(int capacity) {
        data = (E[]) new Object[capacity];
    }

    public int size() {
        return t + 1;
    }

    @Override
    public synchronized boolean isEmpty() {
        return t == -1;
    }

    @Override
    public E push(E e) throws IllegalStateException {
        if (size() == data.length) {
            throw new IllegalStateException("Stack is full");
        }
        data[++t] = e;
        return e;
    }

    public E top() {
        if (isEmpty()) {
            return null;
        }
        return data[t];
    }

    public E pop() {
        if (isEmpty()) {
            return null;
        }
        E answer = data[t];
        data[t] = null;
        t--;
        return answer;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!isEmpty()) {
            for (E datum : data) {
                if (datum != null) {
                    sb.append("[").append(datum).append("]");
                }
            }
        }
        return sb.toString();
    }
}
