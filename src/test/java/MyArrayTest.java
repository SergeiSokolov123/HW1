import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MyArrayTest {
    MyArray<Object> myArray = new MyArray<>();

    @Test
    void add() {
        myArray.add(1);
        myArray.add(2);
        myArray.add(3);
        myArray.add(5);
        myArray.add(4);
        Object[] actual = new Object[5];
        for (int i = 0; i < 5; i++) {
            actual[i] = myArray.get(i);
        }
        Object expected = new Object[]{1, 2, 3, 5, 4};
        assertArrayEquals((Object[]) expected, actual);
    }

    @Test
    void get() {
        myArray.add(789);
        Object actual = myArray.get(0);
        Object expected = 789;
        assertEquals(expected, actual);
    }

    @Test
    void remove() {
        myArray.add(1);
        myArray.add(2);
        myArray.add(4);
        myArray.add(3);
        myArray.add(5);
        myArray.remove(0);
        Object[] actual = new Object[4];
        for (int i = 0; i < 4; i++) {
            actual[i] = myArray.get(i);
        }
        Object[] expected = new Object[] {2,4,3,5};
        assertArrayEquals(expected, actual);
    }

    @Test
    void clear() {
        myArray.add(1);
        myArray.add(2);
        myArray.add(3);
        myArray.add(1);
        myArray.add(2);
        myArray.add(3);
        myArray.clear();
        Object[] actual = new Object[10];
        for (int i = 0; i < 10; i++) {
            actual[i] = myArray.get(i);
        }
        Object[] expected = new Object[] {null,null,null,null,null,null,null,null,null,null};
        assertArrayEquals(expected, actual);
    }

    @Test
    void size() {
       myArray.add(1);
       myArray.add(123123);
        int actual = myArray.size();
        int expected = 2;
        assertEquals(expected, actual);}

    @Test
    void sout() {
        myArray.add(1);
        myArray.add(3);
        myArray.add(5);
        myArray.add(7);
        myArray.add(9);
        myArray.add(11);
        myArray.add(13);
        myArray.add(15);
        myArray.add(17);
        myArray.add(19);
        Object[] actual = new Object[10];
        for (int i = 0; i < 10; i++) {
            actual[i] = myArray.get(i);
        }
        Object[] expected = new Object[]{1,3,5,7,9,11,13,15,17,19};
        assertArrayEquals(expected, actual);
    }
}