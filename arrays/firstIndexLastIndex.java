package arrays;
import java.util.Scanner;

public class firstIndexLastIndex {

    public static void firstIndex(int arr[],int key)
    {
        int start = 0;
        int end = arr.length - 1;
        int mid = 0;
        int fi = -1;

        while(start <= end)
        {
            mid = (start + end)/2;

            if(arr[mid] > key){
                end = mid - 1;
            }
            else if(key > arr[mid])
            {
                start = mid + 1;
            }
            else{
                fi = mid;
                end = mid - 1;
            }
        }

        System.out.println("The Value of First Index is : "+fi);
    }

    public static void lastIndex(int arr[],int key)
    {
        int start = 0;
        int end = arr.length - 1;
        int mid = 0;
        int li = -1;
        while(start <= end)
        {
            mid = (start + end)/2;

            if (arr[mid] < key) 
            {
                start = mid + 1;
            }
            else if(arr[mid] > key){
                end = mid - 1;
            }
            else{
                li = mid;
                start = mid + 1;
            }
        }

        System.out.println("The Value of First Index is : "+li);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Size Of The Array : ");
        int n = sc.nextInt();

        // Creating Array 

        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Key To be searched

        System.out.println("Enter The Repeated Digit");
        int k = sc.nextInt();

        firstIndex(arr,k);
        lastIndex(arr,k);

        sc.close();
    }
}
