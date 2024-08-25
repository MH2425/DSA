package fundamental.linked_lists.singly_linked_lists;

public class SinglyLinkedList<E> {
    private static class Node<E> {
        private E element; // reference to the element stored at this node
        private Node<E> next; // reference to the subsequent node in the list
        public Node(E element, Node<E> next) {
            this.element = element;
            this.next = next;
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

    private Node<E> head; // head node of the list (or null if empty)
    private Node<E> tail; // last node of the list (or null if empty)
    private int size;
    public SinglyLinkedList() {
        head = null;
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
     * Method returns the first element
     * @return E the first element of the singly linked list (but does not remove it)
     */
    public E first() {
        if (isEmpty()) {
            return null;
        } else {
            return head.getElement();
        }
    }

    /**
     * Method returns the last element
     * @return E the last element of singly linked list (but does not remove it)
     */
    public E last() {
        if (isEmpty()) {
            return null;
        } else {
            return tail.getElement();
        }
    }

    /**
     * Adds an element to the front of the list
     * @param e the element needs to be added
     */
    public void addFirst(E e) {
        head = new Node<>(e, head);
        if (size == 0) {
            tail = head;
        }
        size++;
    }

    /**
     * Adds an element to the last of the list
     * @param e the element needs to be added
     */
    public void addLast(E e) {
        Node<E> newest = new Node<>(e, null);
        if (isEmpty()) {
            head = newest;
        } else {
            tail.setNext(newest);
        }
        tail = newest;
        size++;
    }

    /**
     * Remove the first element of the list
     * @return E the element that was deleted
     */
    public E removeFirst() {
        if (isEmpty()) {
            return null;
        } else {
            E res = head.getElement();
            head = head.getNext();
            size--;

            if (size == 0) {
                tail = null;
            }
            return res;
        }
    }

    /**
     * Remove the last element of the list
     * @return E the element that was removed
     */
    public E removeLast() {
        if (isEmpty()) {
            return null;
        } else {
            Node<E> currentNode = head;
            while (currentNode.getNext() != null) {
                currentNode = currentNode.next;
            }
            size--;
            return currentNode.getElement();
        }
    }

    /**
     * Method compares to SinglyLinkedList
     * @param o other SinglyLinkedList
     * @return true ìf the two lists are equals
     */
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }

        if (getClass() != o.getClass()) {
            return false;
        }

        SinglyLinkedList<E> other = (SinglyLinkedList<E>) o;
        if (size != other.size()) {
            return false;
        }

        Node<E> walkA = head;
        Node<E> walkB = other.head;
        while ((walkA != null) && (walkB != null)) {
            if (!walkA.getElement().equals(walkB.getElement())) {
                return false;
            }
            walkA = walkA.getNext();
            walkB = walkB.getNext();
        }
        return true;
    }

    /**
     * Print out the list
     * @return String in format: [e1][e2][e3]...
     */
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        Node<E> currentNode = head;
        for (int idx = 0; idx < size; idx++) {
            stringBuilder.append("[").append(currentNode.getElement()).append("]");
            currentNode = currentNode.next;
        }
        return stringBuilder.toString();
    }
}
