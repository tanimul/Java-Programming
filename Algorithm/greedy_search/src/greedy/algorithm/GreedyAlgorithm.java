package greedy.algorithm;

import java.util.Scanner;
import sun.security.util.Length;

public class GreedyAlgorithm {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        int num[] = {1, 2, 5, 10, 20, 50, 100, 500, 1000};
        int n = sc.nextInt();
        int size = num.length;
        while (n != 0) {
            for (int i = size - 1; i >= 0; i--) {
                if (num[i] <= n) {
                    n -= num[i];
                    System.out.print(num[i] + " ");
                    break;
                }
                if (n == 0) {
                    break;
                }
                
            }

        }

    }
}
