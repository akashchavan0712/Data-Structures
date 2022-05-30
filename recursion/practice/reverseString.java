package recursion.practice;
import java.util.Scanner;

public class reverseString 
{
    public static void reverseString1(String str, int i, String rev)
    {
        // Base Case
        if (i == str.length()-1)
        {
            System.out.print(str.charAt(i));
            return;
        }
        
        // Faith
        reverseString1(str,i+1,rev);

        // My Work
        System.out.print(str.charAt(i));

    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The String To Be Reversed :-");
        String str = sc.nextLine();
        reverseString1(str,0,"");
        sc.close();
    }
}
