package RecursionMethod;
import java.util.ArrayList;
import java.util.Scanner;

class RecursionMethod
{

    Scanner sc = new Scanner(System.in);

    public static ArrayList <String> permutation(String str)
    {
        //Creating ArrayList To Store Combinations
        ArrayList <String> arr = new ArrayList<>();

        // Base Case
        if(str.length() == 0)
        {
            ArrayList <String> base = new ArrayList<>();
            base.add("");
            return base;
        }

        // My Work
        char ch = str.charAt(0);
        str = str.substring(1);

        // Faith
        ArrayList <String> arr1 = permutation(str);

        for (int j = 0; j < arr1.size(); j++) {
            arr.add(""+arr1.get(j));
            arr.add(ch + arr1.get(j));
        }
        
        return arr;
    }
    public static void main(String[] args) {
        System.out.println(permutation("abc"));
    }
    
}
