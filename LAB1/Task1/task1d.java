package LAB1.Task1;
import java.util.Arrays;
import java.util.Scanner;


public class task1d {
     static final int INF = 9999999;


    public static int coins(int n, int a, int b, int c, int arr[])
    {
        int minsum = 0;

        if(n < 0) return INF;

        if(arr[n] != -1)
        {
            return arr[n];
        }

        if(n == 0)
        {
            arr[n] = minsum;
            return minsum;
        }


        else
        {
        minsum = Math.min(
                n,
                Math.min(1 + coins(n - a, a, b, c, arr), Math.min( 
                    1 + coins(n - b, a, b, c, arr),
                    1 + coins(n - c, a, b, c, arr)
                )));
                arr[n] = minsum;
            }
        
        return minsum;

        
    }

    public static void main(String[] args) {

       // Scanner sc = new Scanner(System.in);

        long start = System.nanoTime();
        int n = 9999;
   
        int[] arr = new int[n + 1];
        Arrays.fill(arr, -1);
        int result = coins(n, 5, 6, 7, arr);
        long end = System.nanoTime();

    double ms = (end - start) / 1_000_000.0;
    double sec = ms / 1000.0;

    System.out.println("n = " + n + ", time = " + ms + " ms");
    System.out.println("time = " + sec + " seconds");



  
      

        
    }
    

    

}
