package recursion.recursionQuestionAnswer;
import java.util.Scanner;
public class printSubsequence 
{
    public static void printSubsequence1(String str, String asf)
    {
        if(str.length() == 0)
        {
            System.out.println(asf);
            return; 
        }

        char ch = str.charAt(0);
        String remStr = str.substring(1);

        printSubsequence1(remStr,asf+ch);

        printSubsequence1(remStr,asf);

    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The String You Wish To Enter :");
        String str = sc.nextLine();
        printSubsequence1(str,"");
        sc.close();
    }
}
