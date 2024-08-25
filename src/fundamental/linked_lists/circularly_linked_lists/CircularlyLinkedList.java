package fundamental.linked_lists.circularly_linked_lists;

public class CircularlyLinkedList<E> {
    private Node<E> tail;
    private int size;
    public CircularlyLinkedList() {
        tail = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public E first() {
        if (isEmpty()) {
            return null;
        } else {
            return tail.getNext().getElement();
        }
    }

    public E last() {
        if (isEmpty()) {
            return null;
        } else {
            return tail.getElement();
        }
    }

    /**
     * Update methods
     */
    public void rotate() {          // rotate the first element to the back of the list
        if (tail != null) {         // do nothing if the list is empty
            tail = tail.getNext();  // the old head becomes the new tail
        }
    }

    /**
     * Adds element e to the front of the list
     * @param e element to be added
     */
    public void addFirst(E e) {
        if (size == 0) {
            tail = new Node<>(e, null);
            tail.setNext(tail);     // link to itself
        } else {
            Node<E> newNode = new Node<>(e, tail.getNext());
            tail.setNext(newNode);
        }
        size++;
    }

    /**
     * Adds element e to the back of the list
     * @param e element to be added
     */
    public void addLast(E e) {
        addFirst(e);            // insert the new element at the front of the list
        tail = tail.getNext();  // new element become the tail
    }

    /**
     * Removes and returns the first element
     * @return the first element
     */
    public E removeFirst() {
        if (isEmpty()) {
            return null;
        } else {
            Node<E> head = tail.getNext();
            if (head == tail) {
                tail = null;
            } else {
                tail.setNext(head.getNext());
            }
            size--;
            return head.getElement();
        }
    }

    /**
     * Print out the circularly linked list
     * @return String represents the circularly linked list in the following format:
     *  [e1][e2]...
     */
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int idx = 0; idx < size; idx++) {
            stringBuilder.append("[").append(tail.getNext().getElement()).append("]");
            tail = tail.getNext();
        }
        return stringBuilder.toString();
    }
}
