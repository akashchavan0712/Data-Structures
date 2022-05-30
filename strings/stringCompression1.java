package strings;
import java.util.Scanner;

public class stringCompression1 {

    public static String compression1(String str){
        char c = str.charAt(0);
        String comp = String.valueOf(c);
        for (int i = 1; i < str.length(); i++) {
            if(comp.charAt(comp.length()-1) != str.charAt(i)){
                comp = comp + str.charAt(i);
            }
        }
        return comp;
    }

    public static String compression2(String str){
        String comp2 = "";
        comp2 += str.charAt(0);
        int count = 1;
        for (int i = 1; i < str.length(); i++) {
            if(comp2.charAt(comp2.length()-1) == str.charAt(i)){
                count++;
            }
            else{
                if(count > 1){
                    comp2 = comp2 + count;
                }
                comp2 = comp2 + str.charAt(i);
                count = 1;	
            }
        }

        if(count > 1){
            comp2+=count;
        }
        return comp2;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The String : ");
        String str = sc.nextLine();
        // System.out.println(compression1(str));
        System.out.println(compression2(str));
        sc.close();
    }
}
