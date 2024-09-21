package DataStructures.LinkedList.CircularlyLinkedList;

public class TestCircularlyLinkedList {
    public static void main(String[] args) {
        CircularlyLinkedList<Integer> circularlyLinkedList = new CircularlyLinkedList<>();

        circularlyLinkedList.addFirst(1);
        circularlyLinkedList.addFirst(2);
        circularlyLinkedList.addLast(3);
        circularlyLinkedList.addLast(4);

        System.out.println(circularlyLinkedList.size());
        System.out.println(circularlyLinkedList.isEmpty());
        System.out.println(circularlyLinkedList.first());
        System.out.println(circularlyLinkedList.last());

        System.out.println(circularlyLinkedList);

        circularlyLinkedList.rotate();
        System.out.println(circularlyLinkedList);
    }
}
