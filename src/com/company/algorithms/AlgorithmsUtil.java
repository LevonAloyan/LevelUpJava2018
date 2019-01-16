package com.company.algorithms;

import java.util.Arrays;

public class AlgorithmsUtil {

    public static int [] bubbleSort(int [] array){

        for (int i = array.length -1; i >= 0 ; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array [j+1]){
                    swap(array, j, j+1);
                }
            }
        }
        return array;
    }

    public static int [] selectionSort(int [] array){
        int minIndex;
        for (int i = 0; i < array.length -2; i++) {
            minIndex = i;
            for (int j = i+1; j <= array.length -1; j++) {
                if (array[minIndex] > array[j]){
                    minIndex = j;
                }
            }
            swap(array, i, minIndex);

        }
        return array;
    }


    private static void swap(int [] array, int startIndex, int endIndex){
        int temp = array[startIndex];
        array[startIndex] = array[endIndex];
        array[endIndex] = temp;
    }




    public static void main(String[] args) {
        int [] array = {5,3,4,2,8,9,1,7,6,0};
        int[] bubbleSort = bubbleSort(array);
        int[] selectionSort = selectionSort(array);
        System.out.println(Arrays.toString(bubbleSort));
        System.out.println(Arrays.toString(selectionSort));
    }
}
