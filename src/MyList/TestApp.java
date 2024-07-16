package MyList;

public class TestApp {
    public static void main(String[] args) {
        MyList myArrayList = new MyArrayList();
        myArrayList.add("a");
        myArrayList.add("b");
        myArrayList.add("c", 0); // [c][a][b]
        myArrayList.remove(0); // [a][b]
        System.out.println(myArrayList.size());
        System.out.println(myArrayList);
        System.out.println(myArrayList.get(1));
        System.out.println();

        MyList myLinkedList = new MyLinkedList();
        myLinkedList.add("A");
        myLinkedList.add("BB");
        myLinkedList.add("DDD");
        myLinkedList.add("EEEE");
        myLinkedList.add("CCC", 1);
        System.out.println(myLinkedList.size());
        System.out.println(myLinkedList);
        System.out.println(myLinkedList.get(3));
        myLinkedList.remove(0);
        System.out.println(myLinkedList);
        myLinkedList.remove(2);
        System.out.println(myLinkedList);
        myLinkedList.remove(2);
        System.out.println(myLinkedList);
        System.out.println(myLinkedList.size());
    }
}
