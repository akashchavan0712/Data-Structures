package arrays;
import java.util.*;

public class ArrayElementSubtraction {

    public static void arraySubtraction(int arr1[], int arr2[], int i, int j, int k)
    {
        // Creating Third Array for the given size

        int arr3[] = new int[k];
        k = k - 1;
        int b = 0;
        int av2 = 0;

        while(k >= 0)
        {
            int d = 0;

            if(j >= 0){
                av2 = arr2[j];
            }
            else{
                av2 = 0;
            }

            if( arr1[i] + b >= av2 ){
                d = arr1[i] + b - av2;
                b = 0;
            }
            else{
                d = arr1[i] + b + 10 - av2;
                b = -1;
            }

            arr3[k] = d;

            i--;
            j--;
            k--;
        }

        int m = 0;
        while(m < arr3.length){
            if(arr3[m] == 0){
                m++;
            }
            else{
                break;
            }
        }

        while(m < arr3.length){
            System.out.println(arr3[m]);
            m++;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Size of The Array 1 : ");

        int size1 = sc.nextInt();
        int size3 = size1;

        // Creating Array 1

        int arr1[] = new int[size1];

        System.out.println("Enter The ELements in the array below");
        for (int i = 0; i < size1; i++) 
        {
            arr1[i] = sc.nextInt();
        }

        // Printing Empty Line Just For Making It Look a little nice

        System.out.println();
        System.out.println("Enter The Size of the array to be subtracted from array1 : ");
        int size2 = sc.nextInt();

        // Creating Array 2

        int arr2[] = new int[size2];

        System.out.println("Enter The ELements in the array below");
        for (int i = 0; i < size2; i++) 
        {
            arr2[i] = sc.nextInt();
        }

        size1 = size1 - 1;
        size2 = size2 - 1; 

        System.out.println("\n");

        arraySubtraction(arr1, arr2, size1, size2, size3);
        sc.close();
    }
}
