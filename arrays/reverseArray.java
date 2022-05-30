package arrays;
import java.util.Scanner;

public class reverseArray {

    public static void Reverser(int arr[], int size1){

        int i = 0;
        int j = size1 -1;
        while( i < j){

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        System.out.println("\nReversed Array is \n");
        for (int j2 = 0; j2 < size1; j2++) {
            System.out.println(arr[j2]);
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Size Of The Array : ");
        int size1 = sc.nextInt();
        int arr[] = new int[size1];
        System.out.println("Enter The Elements of The Array : ");
        for (int i = 0; i < size1; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        Reverser(arr,size1);
    }
    
}
