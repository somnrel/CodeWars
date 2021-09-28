package StringSplit;

import java.util.ArrayList;
import java.util.Arrays;

public class StringSplit {
    public static String[] solution(String s) {
        String[] array = s.split("(?<=\\G..)");
        if (s.length()%2!=0){
            array[array.length-1] = s.substring(s.length() - 1,s.length()) + "_";
        }
        return array;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution("as2sds2")));

    }
}
