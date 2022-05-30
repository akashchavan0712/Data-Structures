package recursion.practice;
import java.util.*;

public class firstAndLastOcc 
{
    public static void firstAndLastIndex(String str, int idx, int first, int last, char x)
    {
        // BASE CASE
        if(idx == str.length()-1)
        {
            System.out.println("Last Index = "+last);
            return;
        }

        // MY WORK
        if(str.charAt(idx) == x)
        {
            if(first == -1){
                first = idx;
                System.out.println("First Index = "+first);
            }
            else{
                last = idx;
            }
        }

        // FAITh
        firstAndLastIndex(str,idx+1,first,last,x);
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The String You Want To Be Reversed :-");
        String str = sc.nextLine();
        System.out.println("Enter The Element To Be Searched");
        char ch = sc.next().charAt(0);
        firstAndLastIndex(str,0,-1,-1,ch);
        sc.close();
    }
}
