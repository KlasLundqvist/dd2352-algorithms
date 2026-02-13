package LAB1.Task2;
import java.util.Arrays;

public class task2b {

static int k;

public static double f(int n, int y, double p, double[][] arr, boolean[][] seen)
{
    if (y > n) return 0;

    if (seen[n][y]) {
        return arr[n][y];
    }

    if (y == 0) {
        arr[n][y] = 1;
        seen[n][y] = true;
        return 1;
    }

    if (n == 0) {
        arr[n][y] = 0;
        seen[n][y] = true;
        return 0;
    }

    double result =
        p * f(n - 1, y - 1, p, arr, seen)
      + (1 - p) * f(n - 1, k, p, arr, seen);

    arr[n][y] = result;
    seen[n][y] = true;

    return result;
}

public static void main(String[] args)
{
    long start = System.nanoTime();

    int n = 10000;    
    k = n/2;
    double p = 0.99;

    double[][] memo = new double[n+1][k+1];
    boolean[][] seen = new boolean[n+1][k+1];

    double ans = f(n, k, p, memo, seen);

    long end = System.nanoTime();

    double ms = (end - start) / 1_000_000.0;
    double sec = ms / 1000.0;

    System.out.println("answer = " + ans);
    System.out.println("n = " + n + ", time = " + ms + " ms");
    System.out.println("time = " + sec + " seconds");
}
}
