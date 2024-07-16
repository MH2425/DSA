package MyList;

public class MyArrayList extends MyAbstractList {
    static final int INITIAL_SIZE = 16;
    Object[] objects;
    int size;

    public MyArrayList() {
        objects = new Object[INITIAL_SIZE];
        size = 0;
    }

    @Override
    public void add(Object o) {
        if (size >= objects.length) {
            enlarge();
        }
        objects[size] = o;
        size++;
    }

    @Override
    public void add(Object o, int index) {
        if (size >= objects.length) {
            enlarge();
        }
        if (index == size) {
            add(o);
        } else {
            for (int i = size - 1; i >= index; i--) {
                objects[i + 1] = objects[i];
            }
            objects[index] = o;
        }
        size++;
    }

    @Override
    public Object get(int index) {
        checkBoundaries(index, size - 1);
        return objects[index];
    }

    @Override
    public void remove(int index) {
        checkBoundaries(index, size - 1);
        if (index == size) {
            objects[index] = 0;
        } else {
            for (int i = index; i < size; i++) {
                objects[i] = objects[i + 1];
            }
        }
        size--;
    }

    @Override
    public int size() {
        return this.size;
    }

    public void enlarge() {
        Object[] temp = new Object[objects.length * 2];
        System.arraycopy(objects, 0, temp, 0, objects.length);
        objects = temp;
    }
}
