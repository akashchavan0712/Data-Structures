package strings;
import java.util.Scanner;

public class stringDifference {

    public static String differenceCalculator(String str)
    {

        StringBuilder sb = new StringBuilder();
        int diff = 0;
        char ch1 = str.charAt(0);
        for (int i = 1; i < str.length(); i++) {
            ch1 = str.charAt(i);
            char ch2 = str.charAt(i-1);
            sb.append(ch2);
            diff = ch2 - ch1;
            sb.append(diff);
        }
        sb.append(ch1);
        return sb.toString();
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The String : ");
        String str = sc.next();
        String str1 = differenceCalculator(str);
        System.out.println(str1);
        sc.close();
    }
}
