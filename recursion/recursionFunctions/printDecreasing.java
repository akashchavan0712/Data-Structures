package recursion.recursionFunctions;
import java.util.Scanner;

public class printDecreasing {

    public static void decreaseValue(int value)
    {
        // Base Condition
        if(value == 0)
        {
            return;
        }

        // Faith
        System.out.print(value+" ");

        // Expectations
        decreaseValue(value-1);

    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Max Value : ");
        int n = sc.nextInt();
        decreaseValue(n);
        System.out.println();
        sc.close();
    }
}
