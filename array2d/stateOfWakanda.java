package array2d;
import java.util.Scanner;

public class stateOfWakanda {
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Length of The Row :-");
        int m = sc.nextInt();
        System.out.println("Enter The Length of The Columns :-");
        int n = sc.nextInt();
        
        int arr[][] = new int[m][n];

        System.out.println("Enter The Elements of The array");

        for (int i = 0; i < m; i++) {
            System.out.println("Enter The Row : "+i);
            for (int j = 0; j < n; j++) 
            {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Modified Array : ");

        for (int i = 0; i < n ; i++) 
        {
            for(int j = 0; j < m; j++)
            {
                if(i % 2 == 0)
                {
                    System.out.println(arr[j][i]);
                }
                else
                {
                    int temp = j;
                    j = (m - 1) - j;
                    System.out.println(arr[j][i]);
                    j = temp;
                }
            }
        }
        sc.close();
    }
}
