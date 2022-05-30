package array2d;
import java.util.Scanner;

public class spiralDisplay {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Length of The Row : ");
        int n = sc.nextInt();
        System.out.println("Enter The Length of The Column : ");
        int m = sc.nextInt();

        int arr[][] = new int[n][m];

        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < m; j++) 
            {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Values are :-");
        int count = 0;
        int totalElements = m * n;
        int cmax = m-1;
        int rmax = n-1;
        int cmin = 0;
        int rmin = 0;
        System.out.println("Total Elements are : "+totalElements);

        while(count < totalElements)
        {
            // Left Boundary
            for (int i = rmin; i <= rmax && count < n * m; i++) {
                System.out.println(arr[i][rmin]);
                count++;
            }
            cmin++;

            // Bottom Boundary
            for (int i = cmin; i <= cmax && count < n * m; i++) {
                System.out.println(arr[rmax][i]);
                count++;
            }
            rmax--;

            // Right Boundary
            for (int i = rmax; i >= rmin && count < n * m; i--) {
                System.out.println(arr[i][cmax]);
                count++;
            }
            cmax--;

            // Top Boundary
            for (int i = cmax; i >= cmin && count < n * m; i--) {
                System.out.println(arr[rmin][i]);
                count++;
            }
            rmin++;

        }
        sc.close();
    }
}
