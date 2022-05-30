package recursion.recursionArraylist;
import java.util.*;

public class getStairPaths {
    
    public static ArrayList<String> getStairsArray(int n)
    {
        // Base Case - 1   (Where The n == 0)
        if(n == 0)
        {
            ArrayList<String> base1 = new ArrayList<String>();
            base1.add("");
            return base1;
        }

        // Base Case - 2   (Where The n < 0)
        if(n < 0)
        {
            ArrayList<String> base2 = new ArrayList<String>();
            return base2;
        }

        // Faith - 1
        ArrayList <String> arr1 = getStairsArray(n-1);

        // Faith - 2
        ArrayList <String> arr2 = getStairsArray(n-2);

        // Faith - 3
        ArrayList <String> arr3 = getStairsArray(n-3);

        // Final Array
        ArrayList <String> myAns = new ArrayList<String>();

        // My Work
        for (int i = 0; i < arr1.size(); i++) {
            myAns.add("1"+ arr1.get(i));
        }

        // My Work
        for (int i = 0; i < arr2.size(); i++) {
            myAns.add("2"+ arr2.get(i));
        }

        // My Work
        for (int i = 0; i < arr3.size(); i++) {
            myAns.add("3"+ arr3.get(i));
        }

        return myAns;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number of Stairs");
        int n = sc.nextInt();
        System.out.println(getStairsArray(n));
        sc.close();
    }
}
