package DataStructures.fundamental.linked_lists.singly_linked_lists;

public class TestSinglyLinkedList {
    public static void main(String[] args) {
        SinglyLinkedList<Integer> singlyLinkedList = new SinglyLinkedList<>();
        singlyLinkedList.addFirst(3);
        singlyLinkedList.addFirst(555);
        singlyLinkedList.addLast(3333333);
        singlyLinkedList.addLast(22222233);
        System.out.println(singlyLinkedList);
        System.out.println("---------------");

        System.out.println(singlyLinkedList.removeFirst());
        System.out.println(singlyLinkedList.removeLast());
        System.out.println(singlyLinkedList);

        SinglyLinkedList<Integer> singlyLinkedList1 = new SinglyLinkedList<>();
        singlyLinkedList1.addFirst(3);
        singlyLinkedList1.addLast(3333333);
        System.out.println(singlyLinkedList1);
        System.out.println(singlyLinkedList);

        System.out.println(singlyLinkedList.equals(singlyLinkedList1));
    }
}
