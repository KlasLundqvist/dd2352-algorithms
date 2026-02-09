package LAB1.Task1;
import java.util.Scanner;

public class taske {
    static final int INF = 9999999;

    static int get(int[] arr, int index)
    {

        if(index < 0) return INF;
        return arr[index];

    }

    public static int bot (int n, int a, int b, int c)
    {

        if (n < 0) return INF;

       int botu[] = new int[n + 1];

       botu[0] = 0;

       for(int i = 1; i <= n; i++)
       {
        botu[i] = Math.min(
                i,
                Math.min(1 + get(botu, i-a), Math.min( 
                    1 + get(botu, i-b),
                    1 + get(botu, i-c)
                )));
       }
       return botu[n];

       


       

    }

    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();

    System.out.println(bot(n, a, b, c));



        
    }
    
}
