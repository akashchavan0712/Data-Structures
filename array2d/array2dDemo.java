package array2d;
import java.util.Scanner;

public class array2dDemo {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Creating My First 2d Array in java

        int arr2d[][] = new int[3][4];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) 
            {
                arr2d[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) 
            {
                System.out.print(arr2d[i][j] + "\t");
            }
            System.out.println();
        }


        sc.close();
    }
}
