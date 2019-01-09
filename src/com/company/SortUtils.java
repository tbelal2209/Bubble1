package com.company;

public class SortUtils {
    int[] testArr = {8,6,7,5,3,0,9,10,1,2,3};
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


