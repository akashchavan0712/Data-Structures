package recursion.practice;
import java.util.Scanner;

public class aRaiseTobOpt 
{
    public static int power(int base, int index)
    {
        // Base Case
        if(index == 0)
        {
            return 1;
        }
        if(index % 2 == 0)
        {
            int value = power(base,index/2);
            value = value * base;
            return value;
        }
        else
        {
            int value = power(base,index/2);
            value = (value * base) * base;
            return value;
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Base Of The Number : ");
        int base = sc.nextInt();
        System.out.println("Enter The index Of The Number : ");
        int index = sc.nextInt();
        System.out.println(power(base,index));
        sc.close();
    }
}
