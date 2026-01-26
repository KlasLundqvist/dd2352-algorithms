// Experimenting with dynamic programming using fibonacci sequence
/*





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


    //test 2 bottom up solution

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
       // int[] memo = new int[n + 1];
       // rec(n);   
      // mem(n, memo);
      bot(n);


       

    }


    
}
