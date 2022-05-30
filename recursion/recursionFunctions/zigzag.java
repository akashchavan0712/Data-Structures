package recursion.recursionFunctions;
import java.util.Scanner;

public class zigzag {

    public static void displayZigZag(int n)
    {
        // Base Case
        if(n == 0){
            return;
        }

        // Faith
        System.out.println(n);
        displayZigZag(n-1);
        System.out.println(n);
        displayZigZag(n-1);
        System.out.println(n);
        
        // MyWork
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number");
        int n = sc.nextInt();
        displayZigZag(n);
        sc.close();
    }
}
