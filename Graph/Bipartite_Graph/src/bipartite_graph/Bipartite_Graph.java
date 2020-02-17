package bipartite_graph;

import java.util.Scanner;

/**
 *
 * @author Fuad
 */
public class Bipartite_Graph {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t != 0) {
            int V = sc.nextInt();
            int[][] G = new int[V][V];
            for (int i = 0; i < V; i++) {
                for (int j = 0; j < V; j++) {
                    G[i][j] = sc.nextInt();
                }
            }
            GFG b = new GFG();
            if (b.isBipartite(G, V)) {
                System.out.println("1");
            } else {
                System.out.println("0");
            }
            t -= 1;
        }
    }

    static class GFG {

        boolean isBipartite(int G[][], int V) {
            boolean a = true;
            String RG[] = new String[V];
            RG[0] = "RED";
            level:
            for (int i = 0; i < V; i++) {
                for (int j = 0; j < V; j++) {
                    if (i == j) {
                        if (G[i][j] == 1) {
                            a = false;
                            break level;
                        } else {
                            a = true;
                        }
                    } else {
                        if (G[i][j] == 1) {
                            if (RG[i] == "RED") {
                                if (RG[j] == null) {
                                    RG[j] = "GREEN";
                                    a = true;
                                } else if (RG[j] == "GREEN") {
                                    a = true;
                                } else {
                                    a = false;
                                    break level;
                                }

                            } else if (RG[i] == "GREEN") {
                                if (RG[j] == null) {
                                    RG[j] = "RED";
                                    a = true;
                                } else if (RG[j] == "RED") {
                                    a = true;
                                } else {
                                    a = false;
                                    break level;
                                }

                            } else {
                                RG[j] = "RED";
                                a = true;
                            }
                        } else {
                            continue;
                        }

                    }
                }

            }
            return a;

        }
    }
}
