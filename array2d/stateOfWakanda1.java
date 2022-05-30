package array2d;
import java.util.Scanner;

public class stateOfWakanda1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Length of The Row :-");
        int n = sc.nextInt();
        System.out.println("Enter The Length of The Columns :-");
        int m = sc.nextInt();
        
        int arr[][] = new int[n][m];

        System.out.println("Enter The Elements of The array");

        for (int i = 0; i < n; i++) {
            System.out.println("Enter The Row : "+i);
            for (int j = 0; j < m; j++) 
            {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < m; i++) {
            if(i % 2 ==0)
            {
                for (int j = 0; j < n; j++) {
                    System.out.println(arr[j][i]);
                }
            }
            else
            {
                for (int j = n-1 ; j >= 0; j--) {
                    System.out.println(arr[j][i]);
                }
            }
        }

        sc.close();
    }
}
