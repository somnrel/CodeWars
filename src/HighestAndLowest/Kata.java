package HighestAndLowest;

import java.util.Arrays;

public class Kata {
    static String highAndLow(String InputStr) {

        String[] strArr = InputStr.split(" ");
        int[] intArr = new int[strArr.length];

        for (int i = 0; i < strArr.length; i++) {
            intArr[i] = Integer.parseInt(strArr[i]);
        }
        Arrays.sort(intArr);
        return (intArr[intArr.length - 1] + " " + intArr[0]);
    }
}
