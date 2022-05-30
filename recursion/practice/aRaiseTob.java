package recursion.practice;
import java.util.Scanner;

public class aRaiseTob 
{
    public static int power(int base , int index)
    {
        // Base Case
        if(index == 0)
        {
            return 1;
        }
        if(base == 0)
        {
            return 0;
        }
        // Faith
        int value = power(base, index-1);
        value = base * value; 
        // My Work
        return value;
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Base Of The Number");
        int base = sc.nextInt();
        System.out.println("Enter The Power Of The Number");
        int index = sc.nextInt();
        System.out.println(power(base,index));
        sc.close();
    }
}
