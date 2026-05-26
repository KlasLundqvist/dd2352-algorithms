package LAB2;
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder out = new StringBuilder();

        int V = scanner.nextInt();
        int E = scanner.nextInt();
        int m = scanner.nextInt();

        int[][] edges = new int[E][2];
        for (int i = 0; i < E; i++) {
            edges[i][0] = scanner.nextInt();
            edges[i][1] = scanner.nextInt();
        }

        // Handle m = 0
        if (m == 0) {
            if (V == 0) {
                // YES instance
                out.append("3\n2\n3\n");
                out.append("1 1\n");
                out.append("1 2\n");
                out.append("1 3\n");
                out.append("2 1 3\n");
                out.append("2 2 3\n");
            } else {
                // NO instance
                out.append("2\n1\n2\n");
                out.append("1 1\n");
                out.append("1 1\n");
                out.append("2 1 2\n");
            }
            System.out.print(out);
            return;
        }

        // Handle V < 2 (always YES when m > 0)
        if (V < 2) {
            out.append("3\n2\n3\n");
            out.append("1 1\n");
            out.append("1 2\n");
            out.append("1 3\n");
            out.append("2 1 3\n");
            out.append("2 2 3\n");
            System.out.print(out);
            return;
        }

        // IMPORTANT: cap m to avoid TLE
        m = Math.min(m, V);

        int roles = V + 2;
        int scenes = E + V + 1;
        int actors = m + 2;

        out.append(roles).append('\n');
        out.append(scenes).append('\n');
        out.append(actors).append('\n');

        // Role constraints (colors → actors 3..m+2)
        for (int v = 1; v <= V; v++) {
            out.append(m);
            for (int c = 3; c <= m + 2; c++) {
                out.append(' ').append(c);
            }
            out.append('\n');
        }

        // Diva roles
        out.append("1 1\n");
        out.append("1 2\n");

        // Edge constraints
        for (int i = 0; i < E; i++) {
            out.append("2 ").append(edges[i][0]).append(' ').append(edges[i][1]).append('\n');
        }

        // Ensure every role appears in a scene
        for (int v = 1; v <= V; v++) {
            out.append("2 ").append(v).append(' ').append(V + 1).append('\n');
        }

        // Ensure p2 participates without meeting p1
        out.append("2 1 ").append(V + 2).append('\n');

        System.out.print(out);
    }
}