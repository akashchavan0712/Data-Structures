package recursion.practice;
import java.util.Scanner;

public class moveElement {

    public static String moveChar(String str, char ch, int i,String emp1,String emp2)
    {
        
        if(i == str.length()-1)
        {
            return emp1+emp2;
        }

        if(str.charAt(i) == ch)
        {
            emp2 = emp2 + str.charAt(i);
        }
        else{
            emp1 = emp1 + str.charAt(i);
        }

        return moveChar(str,ch,i+1,emp1,emp2);
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The String Here : ");
        String str = sc.nextLine();
        System.out.println("Enter The Character You Wish To Move : ");
        char ch = sc.next().charAt(0);
        System.out.println(moveChar(str,ch,0,"",""));
        sc.close();
    }
}
