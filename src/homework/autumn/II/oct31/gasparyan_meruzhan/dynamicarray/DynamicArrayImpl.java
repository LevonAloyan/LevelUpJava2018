package homework.autumn.II.oct31.gasparyan_meruzhan.dynamicarray;


public class DynamicArrayImpl<T> implements DynamicArray<T> {
    public static int DEFAULT_CAPACITY = 16;
    public Object[] array;
    int size;

    public DynamicArrayImpl() {
        this.array = new Object[1];
        this.size = array.length;
    }

    public DynamicArrayImpl(int capasi) {
        this.array = new Object[capasi];
        this.size = array.length;
    }

    @Override
    public int size() {
        return array.length;
    }

    @Override
    public boolean isEmpty() {
        return size > 0;
    }

    @Override
    public boolean contains(T o) {
        for (int i = 0; i < size; i++) {
            if (array[i] == o) {
                return array[i] == o;
            }
        }
        return false;
    }

    @Override
    public int indexOf(T o) {
        for (int i = 0; i < size; i++) {
            if (array[i] == o) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(T o) {
        for (int i = size - 1; i >= 0; i--) {
            if (array[i] == o) {
                return i;
            }

        }
        return -1;
    }

    @Override
    public T get(int index) {
        if (index > size - 1) {
            return null;
        } else {
            return (T) array[index];
        }
    }

    @Override
    public T set(int index, T element) {
        if (size - 1 < index) {
            ensureCapacity(index - (size - 1));
        }
        array[index] = element;
        return (T) array[index];
    }

    @Override
    public boolean add(T e) {
        if (array[size - 1] != null) {
            ensureCapacity(1);
        }
        array[size - 1] = e;
        return array[size - 1] == e;
    }

    @Override
    public void addByIndex(int index, T element) {
        if (array[index] != null) {
            ensureCapacity(1);
        }
        for (int i = size - 1; i > index; i--) {
            if (array[i] == null) {
                array[i] = array[i - 1];
                array[i - 1] = null;
            }
        }
        array[index] = element;
    }

    @Override
    public T removeIndex(int index) {
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        ensureCapacity(-1);
        return (T) array[index];
    }

    @Override
    public boolean remove(T o) {
        for (int i = 0; i < size - 1; i++) {
            if (array[i] == o && i < size - 1) {
                array[i] = array[i + 1];
                ensureCapacity(-1);
                return true;
            }
        }
        if (array[size - 1] == o) {
            ensureCapacity(-1);
            return true;
        }
        return false;
    }

    public void ensureCapacity(int index) {
        Object[] temp = new Object[size + index];
        if (index > 0) {
            System.arraycopy(array, 0, temp, 0, array.length);
        } else if (index < 0) {
            System.arraycopy(array, 0, temp, 0, array.length + index);
        }
        array = temp;
        size = array.length;

    }


}
