package MyList;

public class TestApp {
    public static void main(String[] args) {
        MyList myArrayList = new MyArrayList();
        myArrayList.add("a");
        myArrayList.add("b");
        myArrayList.add("c", 0); // [c][a][b]
        myArrayList.remove(0); // [a][b]
        System.out.println(myArrayList);


    }
}
