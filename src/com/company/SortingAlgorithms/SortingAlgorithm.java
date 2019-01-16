package com.company.SortingAlgorithms;
import java.util.Arrays;
import java.util.Random;

public class SortingAlgorithm {

    private static final int DEFAULT_CAPACITY = 10;
    private static int [] array;

    public SortingAlgorithm() {
        this(DEFAULT_CAPACITY);
        randomArray();
    }

    public SortingAlgorithm(int capacity) {
        this.array = new int[capacity];
        randomArray();
    }


    public static int [] bubbleSorting (){
        System.out.println(Arrays.toString(array));
        for (int i=array.length-1; i > 0; i--){
            for (int j=0; j < i; j++){
                if (array[j] > array[j+1]){
                    swap(array,j,j+1);
                }
            }
        }
        return array;
    }

    public static int [] selectionSorting(){
        for (int i=0; i < array.length-2; i++){
            int swapIndex=i;
            for (int j=i+1; j < array.length; j++){
                if(array[swapIndex] > array[j]){
                    swapIndex = j;
                }
            }
            swap(array,i,swapIndex);
        }
        return array;
    }

    private static int [] randomArray () {
        Random rand = new Random();
        for (int i = 0; i < 2; i++)
        {
            array[i] = rand.nextInt(100);
        }
        return array;
    }


        private static void swap (int [] array, int firstIndex, int lastIndex){
        int temp = array [firstIndex];
        array[firstIndex] = array [lastIndex];
        array[lastIndex] = temp;
        }
    }

