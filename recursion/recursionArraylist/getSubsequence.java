package recursion.recursionArraylist;
import java.util.*;

public class getSubsequence {

    public static ArrayList<String> getSubsequence1(String str)
    {
        // Base Case
        if(str.length() == 0)
        {
            ArrayList<String> empt = new ArrayList<String>();
            empt.add("");
            return empt;
        }

        char ch = str.charAt(0);
        String substr = str.substring(1);

        // Faith
        ArrayList<String> callstr = getSubsequence1(substr);

        // Creating Final Array To Store The Result

        ArrayList <String> Final = new ArrayList<String>();

        for (int i = 0; i < callstr.size(); i++) {
            Final.add(callstr.get(i));
        }

        for (int i = 0; i < callstr.size(); i++) {
            Final.add(ch+callstr.get(i));
        }

        return Final;

    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(getSubsequence1(str));
        sc.close();
    }
}
