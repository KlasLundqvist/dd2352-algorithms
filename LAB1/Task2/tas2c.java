package LAB1.Task2;

import java.util.Arrays;
import java.util.Scanner;

public class tas2c {
    static int k;


    public static double g (int n, int k, double p, double arr[])
    {

        double result;

        if(arr[n] != -1)
        {
            return arr[n];
        }

        if(n < k)
        {
            arr[n] = 0;
            return 0;
        }

        if(n == k)
        {
            arr[n] = Math.pow(p, k);
            return arr[n];
        }

        else
        {
           result = g(n - 1, k, p, arr) + Math.pow(p, k) * (1 - p) * (1 - g(n - 1 - k, k, p, arr));
           arr[n] = result;
        }
        return result;

    }


    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    k = sc.nextInt();
    double p = sc.nextDouble();

    double[] memo = new double[n + 1];
    Arrays.fill(memo, -1);
    double print = g(n, k, p, memo);
    System.out.println(print);
    

    }
    
}
