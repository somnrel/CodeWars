package BreakingChocolateProblem;

public class Chocolate {
    public static int breakChocolate(int n, int m) {
        return n != 0 && m != 0 ? ((n * m) - 1) : 0;
    }


    public static void main(String[] args) {
        System.out.println(breakChocolate(0, 0));
    }
}
