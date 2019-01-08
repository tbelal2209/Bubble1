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
    public static boolean checkSum(int[] testArr){
        for (int i = 0; i<testArr.length;i++){
            if(testArr[i]+testArr[i-1]!=){

            }
        }
    }


}

