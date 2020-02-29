package undiretedgraph_cycle;

import com.sun.org.apache.xalan.internal.xsltc.compiler.NodeTest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.logging.Level;

/**
 *
 * @author Fuad
 */
public class UndiretedGraph_cycle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t != 0) {

            ArrayList<ArrayList<Integer>> list = new ArrayList<>();
            int nov = sc.nextInt();
            int edg = sc.nextInt();

            for (int i = 0; i < nov + 1; i++) {
                list.add(i, new ArrayList<>());
            }

            for (int j = 1; j <= edg; j++) {

                int u = sc.nextInt();
                int v = sc.nextInt();
                list.get(u).add(v);
                list.get(v).add(u);
            }
            if (new DetectCycle().isCyclic(list, nov) == true) {
                System.out.println("1");
            } else {
                System.out.println("0");
            }

            t -= 1;
        }
    }
}
    class DetectCycle
{
    static boolean isCyclic(ArrayList<ArrayList<Integer>> list, int V)
    {
    boolean visited[] = new boolean[V]; 
            Arrays.fill(visited,false); 
  
            for (int i = 0; i < V; i++) 
                if (!visited[i] &&  
                     isCyclicConntected(list, i, V, visited)) 
                    return true; 
            return false; 
        
        
    }
 static boolean isCyclicConntected(ArrayList<ArrayList<Integer>> list, int s, 
                                            int V, boolean visited[])  
        { 
              
            // Set parent vertex for every vertex as -1. 
            int parent[] = new int[V]; 
            Arrays.fill(parent, -1); 
  
            // Create a queue for BFS 
            Queue<Integer> q = new LinkedList<>(); 
  
            // Mark the current node as 
            // visited and enqueue it 
            visited[s] = true; 
            q.add(s); 
  
            while (!q.isEmpty())  
            { 
  
                // Dequeue a vertex from  
                // queue and print it 
                int u = q.poll(); 
  
  
                // Get all adjacent vertices  
                // of the dequeued vertex u. 
                // If a adjacent has not been  
                // visited, then mark it visited 
                // and enqueue it. We also mark parent 
                // so that parent is not considered 
                // for cycle. 
                for (int i=0; i<list.get(u).size();i++) 
                { 
                    int v = list.get(u).get(i); 
                    if (!visited[v])  
                    { 
                        visited[v] = true; 
                        q.add(v); 
                        parent[v] = u; 
                    } 
                    else if (parent[u] != v) 
                        return true; 
                } 
            } 
            return false; 
        } 
  
  
   
}
