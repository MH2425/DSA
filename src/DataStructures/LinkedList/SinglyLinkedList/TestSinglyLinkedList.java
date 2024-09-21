package DataStructures.LinkedList.SinglyLinkedList;

public class TestSinglyLinkedList {
    public static void main(String[] args) {
        SinglyLinkedList<Integer> singlyLinkedList = new SinglyLinkedList<>();
        System.out.println("Size of the list = " + singlyLinkedList.size());
        System.out.println("The list is empty? " + singlyLinkedList.isEmpty());

        singlyLinkedList.addFirst(1);
        singlyLinkedList.addLast(2);
        singlyLinkedList.addLast(3);
        System.out.println("The list after added some elements: " + singlyLinkedList);

        System.out.println("The first element of the list is: " + singlyLinkedList.first());
        System.out.println("The last element of the list is: " + singlyLinkedList.last());
        System.out.println("The first element to be removed is: " + singlyLinkedList.removeFirst());

        System.out.println("The singly linked list when removes the first element is: " + singlyLinkedList);
    }
}
