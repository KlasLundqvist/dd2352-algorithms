package LAB1.Task2;
import java.util.Scanner;
import java.util.Arrays;



public class task2a {
//n = total amount of games
//k = number of games in a row needed for vicrtory (2 ≤ k ≤ n)
//p = probability of winning a game
//propability to win a game "f(n,k)" x=n, y=k 

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
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    k = sc.nextInt();
    double p = sc.nextDouble();

    double[][] memo = new double[n+1][k+1];
    boolean[][] seen = new boolean[n+1][k+1];

    double ans = f(n, k, p, memo, seen);

    System.out.println(ans);
}
}
    

