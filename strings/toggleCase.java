package strings;
import java.util.Scanner;

public class toggleCase 
{
    public static void toggleCase1(String str){

        String finalString = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if( c >='a' && c <= 'z'){
                char lower = (char)('A' + c - 'a');
                finalString = finalString + lower;
            }
            else{
                char upper = (char)('a' + c - 'A');
                finalString = finalString + upper;
            }
        }
        System.out.println(finalString);
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The String : ");
        String str = sc.nextLine();
        toggleCase1(str);
        sc.close();
    }

}
