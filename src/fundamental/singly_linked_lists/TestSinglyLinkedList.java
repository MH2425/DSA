package fundamental.singly_linked_lists;

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
    }
}
