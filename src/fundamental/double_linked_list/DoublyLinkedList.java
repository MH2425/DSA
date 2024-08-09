package fundamental.double_linked_list;

public class DoublyLinkedList<E> {
    private Node<E> header;
    private Node<E> trailer;
    private int size;

    public DoublyLinkedList() {
        header = new Node<>(null, null, null);
        trailer = new Node<>(null, header, null);
        header.setNext(trailer);
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
            return header.getNext().getElement();
        }
    }

    public E last() {
        if (isEmpty()) {
            return null;
        } else {
            return trailer.getPrev().getElement();
        }
    }

    /**
     * Adds element e to the linked list in between the given nodes
     * @param e value of the element to be added into
     * @param prevNode the previous node
     * @param afterNode the next node
     */
    public void addBetween(E e, Node<E> prevNode, Node<E> afterNode) {
        Node<E> newNode = new Node<>(e, prevNode, afterNode);
        prevNode.setNext(newNode);
        afterNode.setPrev(newNode);
        size++;
    }

    public void addFirst(E e) {
        addBetween(e, header, header.getNext());
    }

    public void addLast(E e) {
        addBetween(e, trailer, trailer.getPrev());
    }

    public E remove(Node<E> node) {
        Node<E> prevNode = node.getPrev();
        Node<E> afterNode = node.getNext();
        prevNode.setNext(node);
        afterNode.setPrev(node);
        size--;
        return node.getElement();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int idx = 0; idx < size; idx++) {
            if ((header != null) && (header.getNext() != null)) {
                sb.append("[").append(header.getElement()).append("]");
                header = header.getNext();
            }
        }
        return sb.toString();
    }
}
