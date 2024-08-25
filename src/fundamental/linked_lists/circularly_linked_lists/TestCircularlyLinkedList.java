package fundamental.linked_lists.circularly_linked_lists;

public class TestCircularlyLinkedList {
    public static void main(String[] args) {
        CircularlyLinkedList<Integer> circularlyLinkedList = new CircularlyLinkedList<>();
        circularlyLinkedList.addFirst(0);
        circularlyLinkedList.addFirst(3);
        circularlyLinkedList.addLast(6);
        circularlyLinkedList.addLast(99);
        System.out.println(circularlyLinkedList);

        circularlyLinkedList.rotate();
        System.out.println(circularlyLinkedList);

        System.out.println(circularlyLinkedList.removeFirst());
        System.out.println(circularlyLinkedList);
    }
}
