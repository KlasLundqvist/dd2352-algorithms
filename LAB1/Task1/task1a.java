/*
The code recursivly breaks down the input value n to find the samallest possible combinations of abc to eual n and returns the smallest ammount.

*/

package LAB1.Task1;
import java.util.Scanner;

public class task1a {
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

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        System.out.println(coins(n, a, b, c));

        
    }
    
}
