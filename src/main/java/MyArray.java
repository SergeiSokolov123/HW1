import java.util.ArrayList;
import java.util.Arrays;

public class MyArray<E> extends ArrayList<E> {
    private static final int INITIAL_CAPACITY = 10;
    private int size = 0;
    private Object elements[];

    public MyArray() {
        elements = new Object[INITIAL_CAPACITY];

    }

    @Override
    public boolean add(E e) {
        if (size == elements.length) {
            grow();
        }
        elements[size++] = e;
        return true;
    }

    @Override
    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size "
                    + index);
        }
        return (E) elements[index];
    }

    @Override
    public E remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size "
                    + index);
        }
        Object removedElement = elements[index];
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        size--;

        return (E) removedElement;
    }

    @Override
    public void clear() {
        Arrays.fill(elements, null);
    }

    private void grow() {
        int newIncreasedCapacity = elements.length * 2; //пришлось на 2 не знаю как можно расширить на 1.5 корректно
        elements = Arrays.copyOf(elements, newIncreasedCapacity);
    }

    public void sout() {
        System.out.print("My array : ");
        for (int i = 0; i < size; i++) {
            System.out.print(elements[i] + " ");
        }
    }
}

