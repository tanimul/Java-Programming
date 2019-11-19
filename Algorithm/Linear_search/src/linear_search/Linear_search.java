package linear_search;

import java.util.Scanner;

/*
 * @author Fuad
 */

public class Linear_search {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        int numbers[] = {2, 3, 4, 10, 40, 50};
        int x = sc.nextInt();
        int n = numbers.length;
        for (int i =0; i <n; i++) {
            if (numbers[i] == x) {
                System.out.println("number is found at index "+i);
            }
        }

    }

}
