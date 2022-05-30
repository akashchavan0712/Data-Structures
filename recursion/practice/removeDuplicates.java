package recursion.practice;
import java.util.Scanner;
public class removeDuplicates {

    public static boolean map[] = new boolean[25]; 

    public static void removeExtras(String str, int i, String newString){

        // BASE CASE

        if(i == str.length())
        {
            System.out.println(newString);
            return;
        }

        // MY WORK
        char ch = str.charAt(i);

        if(map[ch - 'a'])
        {
            // FAITH
            removeExtras(str, i+1, newString);
        }
        else
        {
            // MY WORK - 2
            newString = newString + ch;
            map[ch - 'a'] = true;

            // FAITH
            removeExtras(str,i+1,newString);
        }

    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The String You Want To Remove Duplicates from : ");
        String str = sc.nextLine();
        removeExtras(str,0,"");
        sc.close();
    }
}
