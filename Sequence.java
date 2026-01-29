import java.util.Arrays;

public class Sequence {


    //looking for the max length of a subsequence
    // LIS[n] = 1 + max{LIS[k] | k < n, A[k] < A[n]}

    public static int lis (int[] a)
    {

        int l = new int[a.length];

        int max = Arrays.stream(l).max().getAsInt();

        for (int i = 1; i < a.length; i++)
        {
            for(int k = 0; k < i; k++)
            {
                if(a[k] < a[i])
                {
                   l[i] = 1 + max;
                }
            }

        }

        return l;

    } 


    

    public static void main(String[] args) {
        
    }
    
    
}
