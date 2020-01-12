package interpolation_search;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Fuad
 */
public class Interpolation_search {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int arr[] = {1, 3, 5, 7, 9, 13, 11, 15}, find, max, value, min = 0;
        Arrays.sort(arr);
        System.out.println("list of array(after sorted):" + Arrays.toString(arr));
        System.out.println("enter a value:");
        find = sc.nextInt();
        max = arr.length - 1;
        value=min+(find-arr[min])*(max-min)/(arr[max]-arr[min]) ;
        System.out.println(value);

    }

}
