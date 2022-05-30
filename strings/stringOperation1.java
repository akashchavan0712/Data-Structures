package strings;
import java.util.Scanner;

public class stringOperation1
{ 
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        // <-------------- Parsing ------------->

        // System.out.println("Enter The String You Want to Store : ");
        // int n = Integer.parseInt(sc.nextLine());
        // System.out.println("Enter Another String If You Can : ");
        // String str = sc.nextLine();
        // System.out.println(n);
        // System.out.println(str);

        // <-------------- CharAt() function ------------->

        // String name = "Akash";
        // char ch = name.charAt(4);
        // System.out.println(ch);
        // int len = name.length();
        // System.out.println(len);

        // <-------------- Substring() function ------------->

        // String name = "Babasaheb";
        // String honorfic = name.substring(4);
        // System.out.println(honorfic);

        // <-------------- Concatenation of Strings ------------->

        String firstName = "Akash";
        String lastName = "Chavan";
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);
        sc.close();


    }
}
