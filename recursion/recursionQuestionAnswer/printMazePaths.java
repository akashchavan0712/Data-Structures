package recursion.recursionQuestionAnswer;
import java.util.Scanner;

public class printMazePaths {

    public static void printMazePaths1(int sr, int sc, int dr, int dc, String ans)
    {
        // Base Case

        if(sr > dr || sc > dc)
        {
            return;
        }

        // My Work
        if(sr == dr && sc == dc )
        {
            System.out.println(ans);
            return;
        }

        // Faith
        printMazePaths1(sr,sc+1,dr,dc,ans+"h");
        printMazePaths1(sr+1,sc,dr,dc,ans+"v");

    }


    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Length of The Paths :");
        int len = sc.nextInt();
        System.out.println("Enter The Breadth of The Paths : ");
        int bre = sc.nextInt();
        printMazePaths1(1,1,len,bre,"");
        sc.close();
    }
}
