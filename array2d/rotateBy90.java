package array2d;
import java.util.Scanner;

public class rotateBy90{

    public static void rotateTheArray(int arr[][], int n, int m)
    {
        System.out.println("The Rotated Array is as follows :");
        int temp = 0;
        
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < m; j++) {
                temp =  arr[j][i];
                arr[j][i] = arr[i][j];
                arr[i][j] = temp;
            }
        }

        twoPointer(arr,n,m);
        
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < m; j++) 
            {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void twoPointer(int arr[][], int n, int m){

        int temp = 0;
        int left = 0;
        int right = n-1;

        while(left < right)
        {
            for (int i = 0; i < n; i++) 
            {
                temp = arr[i][left];
                arr[i][left] = arr[i][right];
                arr[i][right] = temp;
            }
            left++;
            right--;
        }

    }
    public static void main(String[] args) {

        // Making Scanner Object

        Scanner sc = new Scanner(System.in);

        // Take Row and Column Size and

        System.out.println("Enter The Number of Rows : ");
        int n = sc.nextInt();
        System.out.println("Enter The Number of Columns : ");
        int m = sc.nextInt();

        // Creating Array of Given Size and

        int arr[][] = new int[n][m];

        // Taking Input inside the array2d

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) 
            {
                arr[i][j] = sc.nextInt();
            }
        }

        // Closing The Scanner Class
        rotateTheArray(arr, n, m);

        sc.close();

    }
}
