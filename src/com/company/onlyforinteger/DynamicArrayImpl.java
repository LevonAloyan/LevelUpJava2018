package com.company.onlyforinteger;

public class DynamicArrayImpl implements DynamicArray {
    private static final int DEFAULT_CAPACITY = 16;

    public int[] values;
    private int size;

    private int previousElement;

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
        for (int index = 0; index < values.length; index++) {
            if (values[index] == element) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int indexOf(int element) {
        for (int index = 0; index < values.length; index++) {
            if (values[index] == element) {
                return index;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(int element) {
        int indexContains = 0;
        for (int index = 0; index < values.length; index++) {
            if (!contains(element)) {
                return -1;
            } else if (index != values.length && values[index] == element) {
                get(index);
                indexContains = index;
            }
        }
        return indexContains;
    }

    @Override
    public int get(int index) {
        for (int i = 0; i < values.length; i++) {
            if (i == index) {
                return values[index];
            }
        }
        return 0;
    }

    @Override
    public int set(int index, int element) {
        for (int i = 0; i < values.length; i++) {
            if (i == index) {
                previousElement = values[index];
                values[index] = element;
                size--;
            }
        }
        return previousElement;
    }

    @Override
    public boolean add(int element) {
        for (int i = 0; i < values.length; i++) {
            if (size >= values.length) {
                extendArray(values);
            } else if (i == values.length - 1) {
                values[i] = element;
                size++;
                return true;
            }
        }
        return false;
    }

    @Override
    public void add(int index, int element) {
        int i = 0;
        for (; i < values.length; i++) {
            if (i == index) {
                previousElement = values[index];
                if (previousElement != element && previousElement != 0) {
                    values[index + 1] = previousElement;
                }
                values[index] = element;
                size++;
            }
        }
    }


    @Override
    public int removeByIndex(int index) {
        for (int i = 0; i < values.length; i++) {
            if (i == index) {
                values[index] = 0;
                size--;
            }
        }
        return index;
    }

    @Override
    public boolean remove(int o) {
        if (contains(o)) {
            for (int index = 0; index < values.length; index++) {
                if (values[index] == o) {
                    values[index] = 0;
                    size--;
                    index = values.length;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    private void extendArray(int[] array) {
        int[] temporaryArray = new int[values.length * 2];

        System.arraycopy(values, 0, temporaryArray, 0, values.length);
        values = temporaryArray;

    }
}
