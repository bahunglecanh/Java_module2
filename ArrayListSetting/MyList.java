package ArrayListSetting;

import java.util.Arrays;

public class MyList <E>{
    private int size=0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];
    public MyList(){
        elements=new Object[DEFAULT_CAPACITY];
    }
    public MyList(int capcity){
        if (capcity>0){
            elements=new Object[capcity];
        }else {
            throw new IllegalArgumentException("Capcity must be greater than 0");
        }
    }
    public void add(int index,E element){
        if (index>=size || index<0){
            System.out.println("size error");
        }
        for (int i = size; i >index; i--) {
                elements[index]=elements[i-1];
        }
        elements[index]=element;
        size++;
    }
    public E  remove(int index){
        if (index>=size || index<0){
            throw new IndexOutOfBoundsException();
        }
        E oldValue = (E) elements[index];
        int numMoved = size - index - 1;
        if (numMoved > 0) {
            System.arraycopy(elements, index + 1, elements, index, numMoved);
        }
        elements[--size] = null;
        return oldValue;
    }
    public int size() {
        return size;
    }

    public E clone() {
        return (E) elements;
    }

    public boolean contains(E o) {
        return indexOf(o) >= 0;
    }
    public int indexOf(E o) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(o)) {
                return i;
            }
        }
        return -1;
    }
    public boolean add(E e) {
        ensureCapacity(size + 1);
        elements[size++] = e;
        return true;
    }

    private void ensureCapacity(int minCapacity) {
        int oldCapacity = elements.length;
        if (minCapacity > oldCapacity) {
            int newCapacity = oldCapacity * 2;
            elements = Arrays.copyOf(elements, newCapacity);
        }
    }

    public E get(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException();
        }
        return (E) elements[i];
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            elements[i] = null;
        }
        size = 0;
    }
}
