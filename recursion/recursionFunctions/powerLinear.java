package recursion.recursionFunctions;
import java.util.Scanner;

public class powerLinear {

    public static int powerLinear1(int a, int b){

        // Base Case
        if(b == 0)
        {
            return 1;
        }

        // Faith
        int num = powerLinear1(a,b-1);
        
        // Expectations
        int power = a * num;
        return power;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Value of base");
        int base = sc.nextInt();
        System.out.println("Enter The Value of power");
        int power = sc.nextInt();
        System.out.println(powerLinear1(base,power));
        sc.close();
    }
}
