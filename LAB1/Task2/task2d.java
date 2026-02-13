package LAB1.Task2;

import java.util.Arrays;

public class task2d {
    static int k;

    public static double g (int n, int k, double p, double arr[])
    {
        double result;

        if(arr[n] != -1)
            return arr[n];

        if(n < k) {
            arr[n] = 0;
            return 0;
        }

        if(n == k) {
            arr[n] = Math.pow(p, k);
            return arr[n];
        }

        result = g(n - 1, k, p, arr)
               + Math.pow(p, k) * (1 - p)
               * (1 - g(n - 1 - k, k, p, arr));

        arr[n] = result;
        return result;
    }

    public static void main(String[] args) {

        long start = System.nanoTime();

        int n = 100000; 
        k = n/2;
        double p = 0.99;

        double[] memo = new double[n + 1];
        Arrays.fill(memo, -1);

        double result = g(n, k, p, memo);

        long end = System.nanoTime();

        double ms = (end - start) / 1_000_000.0;
        double sec = ms / 1000.0;

        System.out.println("answer = " + result);
        System.out.println("n = " + n + ", time = " + ms + " ms");
        System.out.println("time = " + sec + " seconds");
    }
}
