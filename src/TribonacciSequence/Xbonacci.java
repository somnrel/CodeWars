package TribonacciSequence;

import java.util.Arrays;

public class Xbonacci {
    public double[] tribonacci(double[] s, int n) {
        double[] res = Arrays.copyOf(s, n);
        for (int i = 3; i < n; i++) {
            res[i] = res[i-3] + res[i-2] + res[i-1];
        }
        return res;
}
    public static void main(String[] args) {
        Xbonacci s = new Xbonacci();
        double[] ar = new double[]{0, 1, 1};
        System.out.println(Arrays.toString(s.tribonacci(ar, 2)));
    }
}