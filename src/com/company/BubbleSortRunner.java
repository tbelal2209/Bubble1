package com.company;

public class BubbleSortRunner {
    public static void main(String[] args) {
        int[] testArr = {8, 6, 7, 5, 3, 0, 9, 10, 1, 2, 3};
        String[] arr = {String.valueOf(1),String.valueOf(2),String.valueOf(3),String.valueOf(4), String.valueOf(5)};
        System.out.print("Before: ");
        for (int num : testArr)
            System.out.print(num + " ");
        System.out.println();
        SortingUtils.isSorted(testArr);
        BubbleSort.bubbleSort(testArr);
        SortingUtils.checkSum(testArr);
        SelectionSort.copyArr(arr);
        SelectionSort.copydoubleArr(arr);
        SelectionSort.copylist(arr);
        System.out.print("After: ");
        for (int num : testArr)
            System.out.print(num + " ");
        System.out.println();
    }
}
