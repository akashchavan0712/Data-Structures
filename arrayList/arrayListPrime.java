package arrayList;
import java.util.*;

public class arrayListPrime 
{
    public static void checkPrime(ArrayList <Integer> array)
    {
        ArrayList <Integer> primeArray = new ArrayList<>();

        for (int i = 0; i < array.size(); i++) 
        {
            boolean flag = true;
            int num = array.get(i);
            for (int j = 2; j * j <= num; j++) {
                if(num % j == 0){
                    flag = false;
                    break;
                }
            }
            if(flag == true){
                primeArray.add(num);
            }
        }
        System.out.println(primeArray);
    }

    public static void main(String[] args) 
    {

        // Creating ArrayList

        ArrayList <Integer> array = new ArrayList <>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Size Of The Numebrs You Want To Enter :");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            array.add(sc.nextInt());
        }

        sc.close();
        checkPrime(array);
    }
}
