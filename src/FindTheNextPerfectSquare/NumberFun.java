package FindTheNextPerfectSquare;

public class NumberFun {
    public static long findNextSquare(long sq) {
        long a = (long) Math.sqrt(sq);
        if (Math.pow(a, 2) == sq) {
            return (long) Math.pow(a+1, 2);
        } else {return -1;}
    }

    public static void main(String[] args) {
        System.out.println(findNextSquare(121));
        System.out.println(findNextSquare(625));
        System.out.println(findNextSquare(114));
    }
}
