package recursion.recursionArraylist;
import java.util.*;

public class getMazePath 
{
    public static ArrayList<String> pathFinder(int sr , int sc, int dr, int dc)
    {
        // Base Case
        if(sr == dr && sc == dc)
        {
            ArrayList<String> base = new ArrayList<String>();
            base.add("");
            return base;
        }

        // Creating Two Arrays for Calls and 1 For Final Ans

        ArrayList<String> base_v = new ArrayList<String>();
        ArrayList<String> base_h = new ArrayList<String>();

        if(sc < dc)
        {
            base_h = pathFinder(sr,sc+1,dr,dc);
        }
        
        if(sr < dr)
        {
            base_v = pathFinder(sr+1,sc,dr,dc);
        }

        ArrayList<String> Final_Answer = new ArrayList<String>();

        for (int i = 0; i < base_v.size(); i++) 
        {
            Final_Answer.add("v"+base_v.get(i));
        }
        for (int i = 0; i < base_h.size(); i++) 
        {
            Final_Answer.add("h"+base_h.get(i));
        }

        return Final_Answer;
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Length of The Maze : ");
        int len = sc.nextInt();
        System.out.println("Enter The Breadth of The Maze : ");
        int bre = sc.nextInt();
        System.out.println(pathFinder(0,0,len-1,bre-1));
        sc.close();
    }
}
