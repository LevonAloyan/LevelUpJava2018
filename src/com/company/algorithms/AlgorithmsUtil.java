package com.company.algorithms;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class AlgorithmsUtil {

    public static <T> List<T> bubbleSort(List<T> list, Comparator<T> comparator) {

        for (int i = list.size() - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (comparator.compare(list.get(j), list.get(j + 1)) > 0) {
                    swap(list, j, j + 1);
                }
            }
        }
        return list;
    }

    public static <E> List<E> selectionSort(List<E> list, Comparator<E> comparator){
        int minIndex;
        for (int i = 0; i < list.size() -1; i++) {
            minIndex = i;
            for (int j = i+1; j <= list.size() -1; j++) {
                if (comparator.compare(list.get(minIndex),list.get(j)) > 0){
                    minIndex = j;
                }
            }
            swap(list, i, minIndex);
        }
        return list;
    }


    private static <E> void swap(List<E> list, int first, int second) {
        E tmp;
        tmp = list.get(first);
        list.set(first, list.get(second));
        list.set(second, tmp);
    }


    public static void main(String[] args) {
        int[] array = {5, 3, 4, 2, 0, 9, 1, 7, 6, 8};
//        int[] bubbleSort = bubbleSort(array);
//        int[] selectionSort = selectionSort(array);
//        System.out.println(Arrays.toString(bubbleSort));
//        System.out.println(Arrays.toString(selectionSort));

        IntegerComparator integerComparator = new IntegerComparator();
        List<Integer> integers = new ArrayList<>();
        integers.add(5);
        integers.add(3);
        integers.add(4);
        integers.add(2);
        integers.add(0);
        integers.add(9);
        integers.add(1);
        integers.add(7);
        integers.add(6);
        integers.add(8);
        List<Integer> integers1 = selectionSort(integers, integerComparator);
        for (Integer integer : integers1) {
            System.out.println(integer);
        }

        StringComparator stringComparator = new StringComparator();
        List<String> strings = new ArrayList<>();
        strings.add("Levon");
        strings.add("Gagik");
        strings.add("Vahe");
        strings.add("Aram");
        strings.add("Ashot");
        strings.add("Ash");

        List<String> strings1 = selectionSort(strings, stringComparator);
        for (String s : strings1){
            System.out.println(s);
        }
    }
}
