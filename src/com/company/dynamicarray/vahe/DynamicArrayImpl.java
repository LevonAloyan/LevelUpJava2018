package com.company.dynamicarray.vahe;

import java.util.Arrays;

public class DynamicArrayImpl implements DynamicArray {
    private static final int DEFAULT_CAPACITY = 16;

    private int [] values;
    private int size;

    public DynamicArrayImpl() {
        this(DEFAULT_CAPACITY);
    }

    public DynamicArrayImpl(int capacity) {
        this.values = new int[capacity];
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
    public boolean contains(int element) {
        for (int i = 0; i < values.length; i++)
            if (values[i] == element) {
                return true;
            }

        return false;
    }

    @Override
    public int indexOf(int element) {
        for (int i = 0; i < values.length; i++) {
            if (values[i] == element) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(int element) {
        for (int i = values.length - 1; i >= 0; i--) {
            if (values[i] == element) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int get(int index) {
        if (index < 0 || index > values.length) {
            System.out.println("index is out of bounds");
            return -1;
        }
        if (isEmpty()) {
            return -1;
        }
        return values[index];
    }

    @Override
    public int set(int index, int element) {
        if (index < 0 || index > values.length) {
            System.out.println("index is out of bounds");
            return -1;
        }
        int currentElement = values[index];
        values[index] = element;
        return currentElement;
    }

    @Override
    public boolean add(int e) {
        if (values.length == size) {
            extend(values);
        }
        values[size++] = e;
        return true;
    }


    @Override
    public void add(int index, int element) {
        int j = values.length - 1;
        if (values.length == size || values[values.length - 1] != 0) {
            extend(values);
            for (int i = j; i >= index; i--) {
                values[i + 1] = values[i];
            }
            values[index] = element;
            size += 1;
        } else if (index == values.length - 1) {
            values[index] = element;
            size += 1;
        } else {
            for (int i = j; i > index; i--) {
                values[i] = values[i - 1];
            }
            values[index] = element;
            size += 1;
        }
    }

    @Override
    public int removeByIndex(int index) {
        if (index < 0 || index > values.length) {
            System.out.println("index is out of bounds");
            return -1;
        }
        int currentElement = values[index];
        for (int i = index; i < values.length - 1; i++) {
            values[i] = values[i + 1];
        }
        values[values.length - 1] = 0;
        size--;

        return currentElement;
    }

    @Override
    public boolean remove(int o) {
        int index = -1;
        for (int i = 0; i < values.length; i++) {
            if (values[i] == o) {
                index = i;
                break;
            }
        }
        removeByIndex(index);
        return true;
    }

    private void extend(int[] array) {
        int[] temp = new int[(int) ((1.5 * array.length) + 1)];
        System.arraycopy(array, 0, temp, 0, array.length);
        values = temp;
    }

    public String print() {
        return Arrays.toString(values);
    }
}
