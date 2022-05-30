package arrays;
import java.util.Scanner;

public class inverseArray {

    public static void inverse(int arr[],int arr2[], int n){

        // Creating New Array for inverse use
        for (int i = 0; i < n; i++) {
            int temp = arr[i];
            arr2[temp] = i;
        }

        System.out.println("The Inverted Array is as follows :-");
        for (int i = 0; i < n; i++) {
            System.out.println(arr2[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Size Of The Array : ");
        int n = sc.nextInt();

        // Creating Array

        int arr[] = new int[n];
        int arr2[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        inverse(arr,arr2,n);

        // for (int i = 0; i < n; i++) {
        //     System.out.println(arr[i]);
        // }

        sc.close();
    }
}
