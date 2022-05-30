package arrays;
import java.util.Scanner;

public class subsetArray {

    public static int aRaiseTob(int a, int b){
        int result = a;
        for (int i = 2; i <= b; i++) {
            result = result * a;
        }
        return result;
    }
    
    public static int decimalToBinary(int num){
        int result = 0;
        int power = 1;
        while(num > 0){
            int rem = num % 2;
            num = num / 2;
            result = result + (rem * power);
            power = power * 10;
        }
        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Size Of The Array : ");
        int n = sc.nextInt();

        // Creating Array 
        int arr[] = new int[n];

        // Taking user input into the array
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int ts = aRaiseTob(2,n);

        // Calling The Function To print the subset sint the array

        for (int i = 0; i < ts; i++) {

            int binary = decimalToBinary(i);
            // System.out.println("Binary = "+binary);
            int div = aRaiseTob(10, (arr.length-1));
            // System.out.println("Div = "+div);

            for (int j = 0; j < n; j++) {

                int quo = binary / div;
                int rem = binary % div;

                if(quo == 1){
                    System.out.print(arr[j]+"\t");
                }
                else{
                    System.out.print("-\t");
                }

                binary = rem;
                div/=10;
            }
            
            System.out.println();
        }
        sc.close();
    }
}
