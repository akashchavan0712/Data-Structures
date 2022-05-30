package arrays;
import java.util.Scanner;

public class rotateArray 
{

    public static void reverse(int arr[], int s, int e)
    {

        int i = s, j = e;
        while(i < j)
        {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public static void rotate(int arr[], int k){

        k = k % arr.length;

        if (k < 0){
            k = k + arr.length;
        }

        // Reverse The Whole Array 
        reverse(arr,0,arr.length-1);
        // Reverse The Part 1 (0 - (k-1))
        reverse(arr,0,k-1);
        // Reverse The Part 2 (k - arr.length)
        reverse(arr,k,arr.length-1);

    }

    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Size Of The Array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Enter The Value Of K 
        
        System.out.println("Enter The Value of K : ");
        int k = sc.nextInt();

        sc.close();

        // Call Rotate Array Function
        rotate(arr,k);

        // Print The Rotated Arrays
        System.out.println("\nThe Rotated Array Is As Below");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
