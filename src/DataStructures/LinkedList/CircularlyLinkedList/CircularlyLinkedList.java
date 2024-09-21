package DataStructures.LinkedList.CircularlyLinkedList;

public class CircularlyLinkedList<E> {
    private Node<E> tail;
    private int size;

    /**
     * Default constructor
     */
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

    /**
     * Return the first element
     * @return the data of the first element
     */
    public E first() {
        if (isEmpty()) return null;
        return tail.getNext().getElement();
    }

    /**
     * Return the last element
     * @return the data of the last element
     */
    public E last() {
        if (isEmpty()) return null;
        return tail.getElement();
    }

    /**
     * Rotate the first element to back of the list
     */
    public void rotate() {
        if (tail != null) {
            tail = tail.getNext();
        }
    }

    /**
     * Add new element to the head of the list
     * @param e element to be added
     */
    public void addFirst(E e) {
        if (size == 0) {
            tail = new Node<>(e, null);
            tail.setNext(tail);
        } else {
            Node<E> newNode = new Node<>(e, tail.getNext());
            tail.setNext(newNode);
        }
        size++;
    }

    /**
     * Add element e to the end of the list by insert a new element to the top
     * then set the new element to be the tail
     * @param e element to be added
     */
    public void addLast(E e) {
        addFirst(e);
        tail = tail.getNext();
    }

    /**
     * Remove and return the first element of the list
     * @return the first element to be removed
     */
    public E removeFirst() {
        if (isEmpty()) return null;
        Node<E> head = tail.getNext();
        if (head == tail) tail = null;
        else tail.setNext(head.getNext());
        size--;
        return head.getElement();
    }

    @Override
    public String toString() {
        if (tail == null) {
            return "List is empty";
        }
        Node<E> current = tail.getNext();
        StringBuilder sb = new StringBuilder();
        while (current != tail) {
            sb.append("[").append(current.getElement()).append("]");
            current = current.getNext();
        }
        sb.append("[").append(tail.getElement()).append("]");

        return sb.toString();
    }
}
