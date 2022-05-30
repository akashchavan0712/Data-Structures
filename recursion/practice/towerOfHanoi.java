package recursion.practice;
import java.util.Scanner;

public class towerOfHanoi
{
    public static void towerOfHanoi1(int discs, int source,int helper, int dest)
    {
        // BASE CASE
        if(discs == 1)
        {
            System.out.println(discs+" "+"t"+source+" --> "+"t"+dest);
            return;
        }
        // FAITH - 1
        towerOfHanoi1(discs-1,source,dest,helper);
        // MY WORK
        System.out.println(discs+" "+"t"+source+" --> "+"t"+dest);
        // FAITH - 2
        towerOfHanoi1(discs-1,helper,source,dest);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number Of Discs");
        int n = sc.nextInt();
        towerOfHanoi1(n,11,22,33);
        sc.close();
    }
}
