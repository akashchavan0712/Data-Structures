package recursion.recursionArraylist;
import java.util.*;

public class getKPC 
{
    public static String arr[] = {".;","abc","def","ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};

    public static ArrayList<String> getKeypadValues(String str)
    {
        // Base Case
        if(str.length() == 0)
        {
            ArrayList<String> base = new ArrayList<String>();
            base.add("");
            return base;
        }

        // My Work
        char ch = str.charAt(0);
        String str1 = str.substring(1);

        // Faith
        ArrayList <String> arr1 = getKeypadValues(str1);

        // My-Work - 2
        String code = arr[ch - '0'];
        
        // Final Answer
        ArrayList <String> FinalArray = new ArrayList<String>();

        for (int i = 0; i < code.length(); i++) {
            char ch1 = code.charAt(i);
            for (int j = 0; j < arr1.size(); j++) {
                FinalArray.add(ch1+arr1.get(j));
            }
        }

        return FinalArray;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The The Number : ");
        String str = sc.nextLine();
        System.out.println(getKeypadValues(str));
        sc.close();
    }
}
