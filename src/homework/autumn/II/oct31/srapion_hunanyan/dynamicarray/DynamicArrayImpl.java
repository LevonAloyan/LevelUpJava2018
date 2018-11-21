package homework.autumn.II.oct31.srapion_hunanyan.dynamicarray;

public class DynamicArrayImpl<T> implements DynamicArray<T> {

    public static int DEFAULT_CAPACITY = 16;

    Object[] array;
    int arraylength = array.length;

    DynamicArrayImpl(int capacity) {
        array = new Object[capacity];
    }

    public void initarray(T i) {
        int j = 0;
        array[j] = i;
        j++;

    }

    public int size() {
        int size = arraylength;
        return size;
    }

    public boolean isEmpty() {
        boolean b = true;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                break;
            } else {
                b = false;
            }
        }
        return b;
    }

    public boolean contains(T o) {
        for (int i = 0; i < arraylength; i++) {
            if (array[i] == o) {
                break;
            }
        }
        return true;
    }

    public int indexOf(T o) {
        int i = 0;
        for (; i < arraylength; i++) {
            if (array[i] == o) {
                break;
            }
        }
        if (i == arraylength) {
            i = -1;
        }
        return i;
    }

    public int lastIndexOf(T o) {
        int i = arraylength;
        for (; i < 0; i--) {
            if (array[i] == o) {
                break;
            }
        }
        if (i == 0) {
            i = -1;
        }
        return i;
    }

    public T get(int index) {
        return (T) array[index];
    }

    public T set(int index, T element) {
        T object = (T) array[index];
        array[index] = element;
        return object;
    }

    public boolean add(T e) {
        Object[] temp = new Object[array.length + 1];
        System.arraycopy(array, 0, temp, 0, arraylength);
        temp[array.length + 1] = e;
        array = temp;
        arraylength = array.length;
        return true;
    }

    public void add(int index, T element) {
        Object temp[] = new Object[arraylength + 1];
        System.arraycopy(array, 0, temp, 0, index);
        temp[index] = element;
        System.arraycopy(array, index, temp, index + 1, arraylength - index);
        array = temp;
        arraylength = array.length;
    }

    public T remove(int index) {
        Object temp[] = new Object[arraylength - 1];
        System.arraycopy(array, 0, temp, 0, index);
        T delated = (T) array[index];
        System.arraycopy(array, index + 1, temp, index, arraylength - index);
        array = temp;
        arraylength = array.length;
        return delated;
    }

    public boolean remove(T o) {
        boolean result = true;
        int i = 0;
        for (; i < arraylength; i++) {
            if (o == (T) array[i]) {
                remove(i);
                result = true;
                break;
            }
        }
        if (i == arraylength) {
            result = false;
        }
        return result;
    }
}
