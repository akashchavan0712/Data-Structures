package recursion.recursionFunctions;
import java.util.Scanner;

public class factorial {

    public static void factorial1(int n, int result)
    {
        // Base Case
        if(n == 0){
            System.out.println("Factorail = "+result);
            return;
        }

        // Faith
        result = result * n;

        // Expectation
        factorial1(n-1,result);

    }

    public static int factorial2(int n)
    {
        // Base Case
        if(n == 0){
            return 1;
        }

        // Faith
        int fact = factorial2(n-1);

        // Expectation
        int result = fact * n;
        return result;

    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number You Want To Find Factorial Of : ");
        int n = sc.nextInt();
        // factorial1(n,1);
        sc.close();
        System.out.println(factorial2(n));

    }
}
