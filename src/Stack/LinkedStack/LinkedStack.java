package Stack.LinkedStack;

import java.util.Stack;

public class LinkedStack<E> extends Stack<E> {
    private SinglyLinkedList<E> list = new SinglyLinkedList<>();
    public LinkedStack() {

    }
    public int size() {
        return list.size();
    }
    public boolean isEmpty() {
        return list.isEmpty();
    }
    public E push(E element) {
        list.addFirst(element);
        return element;
    }
    public E top() {
        return list.first();
    }
    public E pop() {
        return list.removeFirst();
    }

    /**
     * Print out the stack
     * @return String in format: [e1][e2][e3]...
     */
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        SinglyLinkedList.Node<E> currentNode = list.head;
        while (currentNode != null) {
            stringBuilder.append("[").append(currentNode.getElement()).append("]");
            currentNode = currentNode.getNext();
        }
        return stringBuilder.toString();
    }
}
