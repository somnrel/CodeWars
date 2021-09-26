package WaitingRoom;

import java.util.Arrays;

public class Kata {
    public static int lastChair(int n) {
        int [] arr = new int[n];
        int i = 0;
        Arrays.setAll(arr, (index) -> 1 + index);
        int [] one = Arrays.copyOfRange(arr, 1, (arr.length / 2) - 1);
        int [] two = Arrays.copyOfRange(arr, (arr.length / 2), arr.length - 1);
        while (i != n) {
            if (two.length > one.length) {
                int [] beg = Arrays.copyOfRange(two, 0, (two.length/2) - 1);
                two = Arrays.copyOfRange(two, two.length/2, two.length);

            }
            else {
                two = Arrays.copyOfRange(two, 1, two.length);
            }
            i++;
            System.out.println("one: " + Arrays.toString(one));
            System.out.println("two: " + Arrays.toString(two));
            System.out.println("i: " + i);
            }

        return n;
        }




    public static void main(String[] args) {
        System.out.println(lastChair(10));
    }
}


// Это все говно, думаю дальше