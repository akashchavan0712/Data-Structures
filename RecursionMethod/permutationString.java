package RecursionMethod;
import java.util.Scanner;

public class permutationString {

    public static void permutation(String str,String ans)
    {
        // Base Case
        if(str.length() == 0)
        {
            System.out.println(ans);
            return;
        }

        for (int i = 0; i < str.length(); i++) 
        {
            // My Work
            char ch = str.charAt(i);
            String restOfString = str.substring(0, i) + str.substring(i+1);
            // Faith
            permutation(restOfString,ans+ch);
        }

    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The String");
        String str = sc.next();
        permutation(str,"");
        sc.close();
    }
}
