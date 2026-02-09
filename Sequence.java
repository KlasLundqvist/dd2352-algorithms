import java.util.Arrays;

public class Sequence {


    //looking for the max length of a subsequence
    // LIS[n] = 1 + max{LIS[k] | k < n, A[k] < A[n]}

    public static int lis (int[] a)
    {

        int[] l = new int[a.length];
         Arrays.fill(l, 1);


        for (int i = 0; i < a.length; i++)
        {
            for(int k = 0; k < i; k++)
            {
                if(a[k] < a[i])
                {
                    l[i] = Math.max(l[i], 1 + l[k]);
                }
            }

        }
        int max = Arrays.stream(l).max().getAsInt();


        return max;

    } 


    

    public static void main(String[] args) {

        int arr[] = {3, 1, 8, 2, 5};

        int m = lis(arr);
        System.out.println(m);
        
    }
    
    
}
