package strings;
import java.util.Scanner;

class stringSubset{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int a = name.length();
        for (int i = 0; i < a; i++) 
        {
            for (int j = i; j < a; j++) 
            {
                boolean flag = true;
                // Getting The Substring
                String substring = name.substring(i,j+1);
                int left = 0;
                int right = substring.length() - 1;
                while(left <= right)
                {
                    char ch1 = substring.charAt(left);
                    char ch2 = substring.charAt(right);
                    if(ch1 != ch2)
                    {
                        flag = false;
                    }
                    left++;
                    right--;
                }
                if(flag == true){
                    System.out.println(substring);
                }
            }
        }
        sc.close();
    }
}