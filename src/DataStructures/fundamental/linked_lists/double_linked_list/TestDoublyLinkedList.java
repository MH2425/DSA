package DataStructures.fundamental.linked_lists.double_linked_list;

public class TestDoublyLinkedList {
    public static void main(String[] args) {
        DoublyLinkedList<Integer> doublyLinkedList = new DoublyLinkedList<>();
        doublyLinkedList.addFirst(1);
        doublyLinkedList.addLast(3);
        System.out.println(doublyLinkedList);
    }
}
