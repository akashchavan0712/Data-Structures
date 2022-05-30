package arrays;
import java.util.Scanner;

public class brokenEconomy2 {

    public static void binarySearch(int arr[], int left, int right, int key){
        int floor = -1;
        int ceil = -1;
        while(left <= right){

            int mid = (left + right) / 2;

            if(arr[mid] == key){
                ceil = arr[mid];
                floor = arr[mid];
                break;
            }
            else if(arr[mid] > key){
                ceil = arr[mid];
                right = mid - 1;
            }
            else{
                floor = arr[mid];
                left = mid + 1;
            }
        }
        
        System.out.println("Ceil = "+ceil);
        System.out.println("Floor = "+floor);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Length of the array ");
        int n = sc.nextInt();

        // Create Array

        int arr[] = new int[n];

        for (int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }

        // Element

        System.out.println("Enter The Element You Want To Find Floor and ceil of : ");
        int k = sc.nextInt();

        binarySearch(arr,0,(n-1),k);
        
        sc.close();

    }
}
