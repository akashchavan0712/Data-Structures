package strings;
import java.util.Scanner;

public class stringCompression {

    public static void stringCompression1(String str)
    {
        int len = str.length();
        for (int i = 1; i < len; i++) 
        {
            char prevChar = str.charAt(i-1);
            char nextChar = str.charAt(i);
            if(nextChar != prevChar)
            {
                System.out.println(prevChar);
            }
        }
        System.out.println(str.charAt(len-1));
    }

    public static void stringCompression2(String str)
    {
        int len = str.length();
        int count = 1;
        for (int i = 1; i < len; i++) 
        {
            char prevChar = str.charAt(i-1);
            char nextChar = str.charAt(i);

            if(nextChar != prevChar)
            {
                System.out.print(prevChar+" ");
                if(count > 1){
                    System.out.print(count+" ");
                }
                count = 1;
            }
            else
            {
                count++;
            }
        }
        System.out.print(str.charAt(len-1)+" ");
        if(count > 1){
            System.out.print(count+" ");
        }
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The String : ");
        String str1 = sc.nextLine();
        // stringCompression1(str1);
        stringCompression2(str1);
        sc.close();
    }

}
