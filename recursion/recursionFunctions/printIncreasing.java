package recursion.recursionFunctions;
import java.util.Scanner;

public class printIncreasing {

    public static void increaseValue(int n){

        // Base Case
        if(n == 0)
        {
            return;
        }

        // Faith
        increaseValue(n-1);

        // Expectation
        System.out.print(n+" ");

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Last Digit");
        int n = sc.nextInt();
        increaseValue(n);
        sc.close();
    }
}
