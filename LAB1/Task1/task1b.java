//Testin the time complexity of the code.
package LAB1.Task1;

import java.util.Scanner;

public class task1b {

    static final int INF = 9999999;


    public static int coins(int n, int a, int b, int c)
    {
        
        int minsum = 0;

        if(n == 0) return 0;

        if(n < 0) return INF;

        
        minsum = Math.min(
                n,
                Math.min(1 + coins(n - a, a, b, c), Math.min( 
                    1 + coins(n - b, a, b, c),
                    1 + coins(n - c, a, b, c)
                )));
        
        return minsum;

        
    }

    public static void main(String[] args) {

        //Scanner sc = new Scanner(System.in);

        //int n = sc.nextInt();
        //int a = sc.nextInt();
        //int b = sc.nextInt();
        //int c = sc.nextInt();
    long start = System.nanoTime();
    int n = 107;

    int result = coins(n, 5, 6, 7);

    long end = System.nanoTime();

    double ms = (end - start) / 1_000_000.0;
    double sec = ms / 1000.0;

    System.out.println("n = " + n + ", time = " + ms + " ms");
    System.out.println("time = " + sec + " seconds"); 

    



        
    }
    
}
