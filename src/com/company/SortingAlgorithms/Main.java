package com.company.SortingAlgorithms;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        SortingAlgorithm sortingAlgorithm = new SortingAlgorithm(5);
        int [] bubbleSorted = sortingAlgorithm.bubbleSorting();
        System.out.println("Bubble sort " + "\n" + Arrays.toString(bubbleSorted));

        int [] selectionSorted = sortingAlgorithm.selectionSorting();
        System.out.println("Selection sort "+ "\n" + Arrays.toString(selectionSorted));


    }
}
