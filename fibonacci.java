// Experimenting with dynamic programming using fibonacci sequence
/*

This project explores the concept of Dynamic Programming by computing Fibonacci numbers using three different methods:

1. Naive recursion – exponential time due to repeated subproblem computation.
2. Top-down memoization – stores computed results to avoid recomputation, reducing time complexity to O(n).
3. Bottom-up tabulation – iteratively builds the solution from base cases, also O(n) time and straightforward space usage.

The goal is to compare how dynamic programming techniques improve performance relative to the naive recursive approach.

*/
public class fibonacci {




// test 1 recursive fibonacci
    public static int rec (int n)
    {

        int result = 0;

        if (n == 1 || n == 2)
        {
            result = 1;
        }
        else
            {
                result = rec(n - 1) + rec(n - 2);
                System.out.println(result);
            }

        return result;
    }

    //test 2 uses Memoized solution

    public static int mem (int n, int arr[])
    {
        int result = 0;
        if (arr[n] != 0)
        {
            return arr[n];
        }
        if(n == 1 || n == 2)
        {
            result = 1;
        }
         else
        {
            result = mem(n - 1, arr) + mem(n - 2, arr);
        }
        arr[n] = result;
        System.out.println(result);
        return result;
    }
        

    //test 3 bottom up.

    public static int bot(int n)
    {
        if(n == 1 || n == 2)
        {
            return 1;
        }

       int botu[] = new int[n + 1];
       botu[1] = 1;
       botu[2] = 1;
       for(int i = 3; i <= n; i++)
       {
        botu[i] = botu[i - 1] + botu[i - 2];
        System.out.println(botu[i]);
       }
       return botu[n];
       

    }




    public static void main(String[] args) {
        int n = 5;
        int[] memo = new int[n + 1];
       // rec(n);   
       mem(n, memo);
      //bot(n);


       

    }


    
}
