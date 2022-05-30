package array2d;
import java.util.Scanner;

public class stateOfWakanda2 {

    public static void diagonalDisplay(int arr[][] , int m)
    {
        for (int i = 0; i < m; i++) {
            int j = 0;
            int k = i;
            while(j < m && k < m){
                System.out.println(arr[j][k]);
                j++;
                k++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Length of The Row :-");
        int m = sc.nextInt();
        
        int arr[][] = new int[m][m];

        System.out.println("Enter The Elements of The array");

        for (int i = 0; i < m; i++) {
            System.out.println("Enter The Row : "+i);
            for (int j = 0; j < m; j++) 
            {
                arr[i][j] = sc.nextInt();
            }
        }

        diagonalDisplay(arr,m);

        sc.close();
    }
}
