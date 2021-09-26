package BouncingBalls;

public class BouncingBalls {
    public static int bouncingBall(double h, double bounce, double window) {
        int count = -1;
        if ((h > 0) && (bounce > 0) && (bounce < 1) && (window < h)) {
            while (h > window){
                count +=2;
                h *= bounce;
            }
            return count;
        }
        else {
            return -1;
        }
    }

    public static void main(String[] args) {
        System.out.println(bouncingBall(10.0, 0.5, 5));
    }
}


