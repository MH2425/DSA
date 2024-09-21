package DataStructures.LinkedList.SinglyLinkedList;

public class SinglyLinkedList<E> {
    private Node<E> head;
    private Node<E> tail;
    private int size;

    /**
     * Node class
     * @param <E>
     */
    private static class Node<E> {
        private E element;
        private Node<E> next;
        public Node(E e, Node<E> n) {
            element = e;
            next = n;
        }

        public E getElement() {
            return element;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }
    }

    /**
     * Default constructor
     */
    public SinglyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    /**
     * Get the size of the list
     * @return size of the list
     */
    public int size() {
        return size;
    }

    /**
     * Checks if the list is empty
     * @return true if the list is empty, otherwise returns false
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * Return the first element
     * @return the first element but does not remove it
     */
    public E first() {
        if (isEmpty()) {
            return null;
        } else {
            return head.getElement();
        }
    }

    /**
     * Return the last element
     * @return the last element but does not remove it
     */
    public E last() {
        if (isEmpty()) {
            return null;
        } else {
            return tail.getElement();
        }
    }

    /**
     * Adds new element to the top of the list
     * @param e new head element
     */
    public void addFirst(E e) {
        head = new Node<>(e, head);
        if (size == 0) {
            tail = head;
        }
        size++;
    }

    /**
     * Adds new element to the end of the list
     * @param e new tail element
     */
    public void addLast(E e) {
        Node<E> newTail = new Node<>(e, null);
        if (isEmpty()) {
            head = newTail;
        } else {
            tail.setNext(newTail);
            tail = newTail;
        }
        size++;
    }

    /**
     * Removes and returns the first element of the list
     * @return the first element of the list
     */
    public E removeFirst() {
        if (isEmpty()) {
            return null;
        }

        E answer = head.getElement();
        size--;
        if (size == 0) {
            tail = null;
        }
        return answer;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node<E> currentNode = head;
        while (currentNode != null) {
            sb.append("[").append(currentNode.getElement()).append("]");
            currentNode = currentNode.next;
        }
        return sb.toString();
    }
}
