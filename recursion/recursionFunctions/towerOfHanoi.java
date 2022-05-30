package recursion.recursionFunctions;
import java.util.Scanner;

public class towerOfHanoi 
{
    public static void toh(int n, int t1, int t2, int t3)
    {

        // Base Case
        if(n == 1){
            System.out.println(n+"["+t1+"->"+t2+"]");
            return;
        }

        // Faith - 1
        // During The First Approach

        /*
            1.Transfer All The (n-1) Disks To Helper
            2.After Transfering (n-1) Disks To Helper Print() Thr Outcome
        */

        toh(n-1, t1, t3, t2);   //t1 = source t2 = destination t3 = helper

        // My Work
        System.out.println(n+"["+t1+"->"+t2+"]");

        // Faith - 2
        toh(n-1, t3, t2, t1);

    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number Of Disks :- ");
        int n = sc.nextInt();
        int t1 = sc.nextInt();
        int t2 = sc.nextInt();
        int t3 = sc.nextInt();
        toh(n,t1,t2,t3);
        sc.close();
    }
}
