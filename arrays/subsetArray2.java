package arrays;
import java.util.Scanner;
import java.lang.Math;

public class subsetArray2 {

    public static int binaryToDecimal(int num){

        int result = 0;
        int power = 1;

        while(num > 0){
            int rem = num % 2;
            num = num / 2;
            result = result + (rem * power);
            power *= 10;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Length of The Array : ");
        int n = sc.nextInt();

        // Creating The Array of User Given Size

        int arr[] = new int[n];

        // Array which will take the input

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        sc.close();

        // Total Possible Number Of Subsets Possible

        int total = (int)Math.pow(2,n);

        // Run The Loop Until The Final Combination is Printed Out

        for (int i = 0; i < total; i++) {

            int binary = binaryToDecimal(i);
            int div = (int)Math.pow(10,n-1);

            for (int j = 0; j < n; j++) {
                
                // Getting Quotient And Remainder

                int quo = binary / div;
                int rem = binary % div;

                if(quo == 1){
                    System.out.print(arr[j] + "\t");
                }
                else{
                    System.out.print("-\t");
                }
                
                binary = rem;
                div /= 10;
            }
            System.out.println();
        }
    }
}
