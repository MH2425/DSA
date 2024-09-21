package DataStructures.LinkedList.DoublyLinkedList;

public class TestDoublyLinkedList {
    public static void main(String[] args) {
        DoublyLinkedList<Integer> doublyLinkedList =
                new DoublyLinkedList<>();
        doublyLinkedList.addFirst(1);
        doublyLinkedList.addFirst(2);
        doublyLinkedList.addLast(3);
        doublyLinkedList.addLast(4);

        System.out.println(doublyLinkedList.size());
        System.out.println(doublyLinkedList.isEmpty());
        System.out.println(doublyLinkedList.first());
        System.out.println(doublyLinkedList.last());

        System.out.println(doublyLinkedList);

        int a = doublyLinkedList.removeFirst();
        int b = doublyLinkedList.removeLast();

        System.out.println(doublyLinkedList);
    }
}
