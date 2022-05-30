package leetcode;
import java.util.Scanner;

public class ghost 
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int x = 9 - n;
        int count = 1;
        int j = 9;
        
        for (int i = 9; i > x; i--) 
        {
            if(n == 1){
                count = 10;
                break;
            }
            else
            {
                if(i == 8){
                    count = count * 9;
                }
                else
                {
                    count = count * j;
                    j--;
                }
            }
        }

        System.out.println(count);
        sc.close();
    }
}
