package arrays;
import java.util.Scanner;

// Total Subarrays in a given array
// Total = n (n + 1) / 2, where n is the length of array


public class subArray {

    public static void subArrayPrinter(int arr[]){

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int j2 = i; j2 < j; j2++) {
                    System.out.print(arr[j2]);
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Length of the Array");
        int n = sc.nextInt();

        // Creating Array of Size n

        int arr[] = new int[n];

        System.out.println("Enter The Elements Of The Array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt(); 
        }

        subArrayPrinter(arr);
        sc.close();
    }
}
