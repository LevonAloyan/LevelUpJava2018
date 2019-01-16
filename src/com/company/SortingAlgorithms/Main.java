package com.company.SortingAlgorithms;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        SortingAlgorithm sortingAlgorithm = new SortingAlgorithm();
        int [] bubbleSorted = sortingAlgorithm.bubbleSorting();
        int [] selectionSorted = sortingAlgorithm.selectionSorting();
        System.out.println("Selection sorting "+ "\n" + Arrays.toString(selectionSorted));
        System.out.println("Bubble sorting " + "\n" + Arrays.toString(bubbleSorted));

    }
}
