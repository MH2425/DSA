package MyList;

public class MyLinkedList extends MyArrayList {
    MyLinkedListNode head;
    int size;

    public MyLinkedList() {
        this.head = null;
        size = 0;
    }

    private MyLinkedListNode getNodeByIndex(int index) {
        MyLinkedListNode current = head;
        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }
        return current;
    }

    @Override
    public void add(Object o) {
        add(o, size);
    }

    @Override
    public void add(Object o, int index) {
        checkBoundaries(index, size);
        if (index == 0) {
            head = new MyLinkedListNode(o, head);
        } else {
            MyLinkedListNode current = getNodeByIndex(index - 1);
            current.setNext(new MyLinkedListNode(o, current.getNext()));
        }
        size++;
    }

    @Override
    public Object get(int index) {
        checkBoundaries(index, size);
        if (size == 0) {
            System.out.println("The list is empty\n");
            return null;
        } else {
            return getNodeByIndex(index).getPayload();
        }
    }

    @Override
    public void remove(int index) {
        checkBoundaries(index, size);
        if (index == 0) {
            head = head.getNext();
        } else if (index == size - 1) {
            getNodeByIndex(index).setNext(null);
        } else {
            MyLinkedListNode previousNode = getNodeByIndex(index - 1);
            MyLinkedListNode afterNode = getNodeByIndex(index + 1);
            previousNode.setNext(afterNode);
        }
        size--;
    }

    @Override
    public int size() {
        return this.size;
    }
}
