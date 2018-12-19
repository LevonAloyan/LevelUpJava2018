package com.company.dynamicarray.vahe;

public class DynamicArrayImpl implements DynamicArray {
    private static final int DEFAULT_CAPACITY = 16;

    private int[] values;
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
        for (int i=0; i < size; i++)
            if (values[i]==element){
                return true;
            }
        return false;
    }

    @Override
    public int indexOf(int element) {
        for (int i=0; i < values.length; i++){
            if(values[i]==element){
                return i;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(int element) {
        for (int i = values.length-1; i >= 0; i--) {
            if (values[i] == element) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int get(int index) {
        if (isEmpty()) {
            return -1;
        }
        return values[index];
    }

    @Override
    public int set(int index, int element) {
        if (values[index] != 0){
            int currentElement = values[index];
            values[index]=element;
            size += 1;
            return currentElement;
        }
        else
        {
            values[index]=element;
            size += 1;
            return 0;
        }
    }

    @Override
    public boolean add(int e) {
        if (values.length == size){
            extend(values);
            values[size]=e;
            size += 1;
            return true;

        }else{
            for (int i=values.length-1; i >= 0; i--){
                if (values[i]==0){
<<<<<<< Updated upstream
                    values[i]=e;
                    size += 1;
                    return true;
=======
                    if(values[i-1]!=0) {
                        values[i] = e;
                        size += 1;
                        return true;
                    }
>>>>>>> Stashed changes
                }
            }
        }
        return false;
    }

    @Override
    public void add(int index, int element) {
        int j=values.length-1;
        if(values.length==size||values[values.length-1]!=0){
            extend(values);
            for (int i=j; i >= index; i--){
                values[i+1]=values[i];
            }
            values[index]=element;
            size += 1;
        }else if (index==values.length-1){
            values[index]=element;
            size += 1;
        }else{
           for (int i=j; i > index; i--){
               values[i]=values[i-1];
           }
           values[index]=element;
           size += 1;
        }
    }

    @Override
    public int removeByIndex(int index) {
<<<<<<< Updated upstream
        return 0;
=======
        int currentElement = values[index];
        if (index==values.length-1){
            values[index]=0;
            size -= 1;
            return currentElement;

        }else{
            for (int i=index; i < values.length-1; i++) {
                values[i]=values[i+1];
            }
            values[values.length-1]=0;
            size -= 1;
            return currentElement;
        }
>>>>>>> Stashed changes
    }

    @Override
    public boolean remove(int o) {
<<<<<<< Updated upstream
=======
        if(values[values.length-1]==o){
            values[values.length-1]=0;
            size -= 1;
            return true;
        }else{
            int i=0;
            while (values[i]!=o && i < values.length-1){
               i++;
            }
            for (int j=i; j < values.length-1; j++){
               values[j]=values[j+1];
            }
            values[values.length-1]=0;
            size -= 1;
        }
>>>>>>> Stashed changes
        return false;
    }

    private void extend(int[] array) {
        int[] temp = new int[array.length + 5];
        System.arraycopy(array, 0, temp, 0, array.length);
        values=temp;
    }
}
