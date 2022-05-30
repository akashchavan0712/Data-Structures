package recursion.recursionFunctions;
import java.util.Scanner;

public class multicalls {

    public static void multicalls1(int n)
    {
        if(n == 0)
        {
            return;
        }
        System.out.println("Pre "+n);
        multicalls1(n-1);
        System.out.println("In "+n);
        multicalls1(n-1);
        System.out.println("Post "+n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number You Wish : ");
        int n = sc.nextInt();
        multicalls1(n);
        sc.close();
    }
}
