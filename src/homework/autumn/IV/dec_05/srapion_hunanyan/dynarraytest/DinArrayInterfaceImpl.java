package homework.autumn.IV.dec_05.srapion_hunanyan.dynarraytest;

public class DinArrayInterfaceImpl<E> implements DynArrayInterface<E> {

    private static final int default_capacity = 16;
    private Object[] array;
    private int size;

    DinArrayInterfaceImpl() {
        this(default_capacity);
    }

    public DinArrayInterfaceImpl(int capacity) {
        this.array = new Object[capacity];
        this.size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(E o) {
        return indexOf(o) >= 0;
    }

    @Override
    public int indexOf(E o) {
        if (o == null) {
            return indexOfNull();
        }
        for (int i = 0; i < size; i++) {
            if (array[i] == o) {
                return i;
            }
        }
        return -1;
    }

    private int indexOfNull() {
        for (int i = 1; i <= size; i++) {
            if (array[i] == null) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(E o) {
        if (o == null) {
            return lastIndexOfNull();
        }
        for (int i = size; i > 0; i--) {
            if (array[i] == o) {
                return i;
            }
        }
        return -1;
    }

    private int lastIndexOfNull() {
        for (int i = size; i > 0; i--) {
            if (array[i] == null) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public E get(int index) {
        if (index < 0 || index > size - 1) {
            throw new ArrayIndexOutOfBoundsException(index);
        }
        return (E) array[index];
    }

    @Override
    public E set(int index, E o) {
        if (index < 0 || index > size) {
            throw new ArrayIndexOutOfBoundsException(index);
        }
        E temp = (E) array[index];
        array[index] = o;
        return temp;
    }

    @Override
    public boolean add(E o) {
        if (size == array.length - 1) {
            enshureCapacity();
        }
        array[size++] = o;
        return true;
    }

    private void enshureCapacity() {
        Object[] temp = new Object[(int) ((1.5 * array.length) + 1)];
        System.arraycopy(array, 0, temp, 0, array.length);
        array = temp;
    }

    @Override
    public void add(int index, E o) {
        if (index > size || index < 0) {
            throw new ArrayIndexOutOfBoundsException(index);
        }
        if (size == array.length - 1) {
            enshureCapacity();
        }
        size++;
        for (int i = size; i > index; i--) {
            array[i] = array[i - 1];
        }
        array[index] = o;
    }

    @Override
    public boolean remove(E o) {
        if (o == null) {
            return removeNull(o);
        }
        for (int i = 0; i < size; i++) {
            if (o == (E) array[i]) {
                remove(i);
                return true;
            }
        }
        return false;
    }

    private boolean removeNull(E o) {
        for (int i = 1; i <= size; i++) {
            if (array[i] == null) {
                remove(i);
                return true;
            }
        }
        return false;
    }

    @Override
    public E remove(int index) {
        if (index < 0 || index > size) {
            throw new ArrayIndexOutOfBoundsException(index);
        }
        E delated = (E) array[index];
        for (int i = index; i < size; i++) {
            array[i] = array[i + 1];
        }
        size--;
        return delated;
    }
}
