package array2d;
import java.util.Scanner;

public class saddlePrice {

    public static void SaddlePriceFinder(int arr[][], int n){

        // First Finding The Least Element in The row of the

        for (int i = 0; i < n; i++) {
            int min = arr[i][i];
            int column = 0;

            for (int j = 0; j < n; j++) {
                if(arr[i][j] < min){
                    min = arr[i][j];
                    column = j;
                }
            }

            boolean found = true;
            for (int j = 0; j < n; j++) {
                if(arr[j][column] > min){
                    found = false;
                    break;
                }
            }

            if(found == true){
                System.out.println(min);
                return;
            }
        }
        System.out.println("Invalid Code");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number of Rows and Columns : ");
        int n = sc.nextInt();

        // Taking user input
        int arr[][] = new int[n][n];

        System.out.println("Enter The Values : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        SaddlePriceFinder(arr,n);

        sc.close();
    }
}
