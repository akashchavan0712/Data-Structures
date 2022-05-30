package recursion.recursionFunctions;
import java.util.Scanner;

public class powerLogarithmic {

    public static int powerLogarithmic1(int b, int p)
    {
        // Base Case
        if(p == 0){
            return 1;
        }

        // Faith
        int num = powerLogarithmic1(b,p/2);

        // My Work
        int ans = num * num;
        if(p % 2 != 0){
            ans = ans * b;
        }

        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Base");
        int base = sc.nextInt();
        System.out.println("Enter The Power");
        int power = sc.nextInt();
        System.out.println(powerLogarithmic1(base,power));
        sc.close();
    }
}
