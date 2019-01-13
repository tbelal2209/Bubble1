package com.company;

public class SortingUtils {
    int[] testArr = {8,6,7,5,3,0,9,10,1,2,3};
    static boolean swap = true;
    public static int selectionSort(int[] testArr){
        int minInd = testArr[0];
        for (int i = testArr[0]; i <testArr.length; i++)
        {
            if (testArr[i] < testArr[minInd])
            {
                swap(testArr,i,minInd);
                minInd = i;
            }
        }
        return minInd;

    }

    private static void swap(int[] testArr, int i, int minInd) {
    }


    public static int isSorted(int[] testArr) {
        int min = testArr[0];
        for (int i = 0; i < testArr.length; i++) {
            if (i<min){
                return testArr[i];
            }
        }
        return min;
    }
    public static void checkSum(int[] testArr) {
        int[] sum1 = new int[testArr.length];
        int [] sum2 = testArr;
        for (int i = 0; i < testArr.length; i++) {
            if (sum2 == sum1) {
                continue;
            }
        }
    }
}



