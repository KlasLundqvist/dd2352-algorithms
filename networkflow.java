import java.io.*;
import java.lang.*;
import java.util.*;
import java.util.LinkedList;

public class networkflow {
    static final int V = 6;

    public static boolean bfs (int rGraph[][], int s, int t, int parent[])
    {
        boolean visited[] = new boolean[V];
        for (int i = 0; i < V; i++ )
        {
            visited[i] = false;
        }

        LinkedList<Integer> queue
            = new LinkedList<Integer>();
        queue.add(s);
        visited[s] = true;
        parent[s] = -1;

        while (queue.size() != 0)
        {
            int u = queue.poll();

            for (int v = 0; v < V; v++)
            {
                if (visited[v] == false && rGraph[u][v] > 0)
                {
                     if (v == t) {
                        parent[v] = u;
                        return true;
                    }
                    queue.add(v);
                    parent[v] = u;
                    visited[v] = true;

                }
            }
        }

        return false;

    }


    public static void main(String[] args) {
        
    }
    
}
