package recursion.practice;
import java.util.Scanner;

public class stringSubsequence {

    public static void printSubsequence(String str, int i, String substr)
    {
        // Base Case
        if(i == str.length())
        {   
            System.out.println(substr);
            return;
        }

        char ch = str.charAt(i);

        // Without Considering
        // Faith-1
        printSubsequence(str,i+1,substr);


        // With Consideration
        // Faith-2
        
        printSubsequence(str,i+1,substr+ch);

    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The String : ");
        String str = sc.nextLine();
        printSubsequence(str,0,"");
        sc.close();
    }
}
