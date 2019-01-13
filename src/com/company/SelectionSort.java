package com.company;

public class SelectionSort {
    public static int[] copyArr(String[] testArr) {
        int[] copytestArr = new int[10];
        for (int n = 0; n < testArr.length; n++) {
            copytestArr[n] = Integer.parseInt(testArr[n]);
        }
        return copytestArr;
    }

    public static String[] copylist(String[] list) {
        String[] copylist = new String[10];
        for (int n = 0; n < list.length; n++) {
            copylist[n] = list[n];
        }
        return copylist;
    }

    public static double[] copydoubleArr(String[] doubleArr) {
        double[] copydoubleArr = new double[10];
        for (int n = 0; n < doubleArr.length; n++) {
            copydoubleArr[n] = Double.parseDouble(doubleArr[n]);
        }
        return copydoubleArr;
    }


}
