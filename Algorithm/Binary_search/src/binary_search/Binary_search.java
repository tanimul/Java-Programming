
package binary_search;

import java.util.Arrays;
import java.util.Scanner;

public class Binary_search {

   static Scanner sc=new Scanner(System.in);
    
    public static void main(String[] args) {
        
        int arr[]={1,3,5,7,8,9,24,10,79},start=0,end=arr.length-1,find,mid;
        Arrays.sort(arr);
        System.out.println("list of array(after sorted):"+Arrays.toString(arr));
        System.out.println("enter a value:");
        find=sc.nextInt();
        mid=(start+end)/2;
        while(start<=end){
            if(arr[mid]<find){
                start=mid+1;
            }
            else if(arr[mid]==find){
                System.out.println("Element "+mid+" found at index:"+mid);
                break;
            }
            else{
                end=mid-1;
            }
            
           mid=(start+end)/2;
        }

        if(start>end){
            System.out.println("Element not found.");
        }
        
       
        
    }
    
}
