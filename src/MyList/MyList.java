package MyList;

public interface MyList {
    void add(Object object);
    void add(Object object, int index);
    void remove(int index);
    int size();
    Object get(int index);
}
