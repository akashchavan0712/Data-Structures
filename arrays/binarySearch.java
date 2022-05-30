package arrays;
import java.util.Scanner;

public class binarySearch {

    public static void binarySearchAlgo(int arr[], int key){

        int left = 0;
        int right = arr.length - 1;
        while(left <= right){

            int mid = ( left + right ) / 2;
            
            if(arr[mid] == key){
                System.out.println("Element Found At Index : "+mid);
                break;
            }
            else if(key < arr[left] || key > arr[right]){
                System.out.println("Sorry Array Doesn't Contain Any Element That Matches Your Query");
                break;
            }
            else if(arr[mid] > key){
                right = mid-1;
            }
            else
            {
                left = mid+1;
            }

        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Length Of The Array : ");
        int n = sc.nextInt();

        // Creating Array 

        int arr[] = new int[n];

        // Taking Input Inside The Array

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Ask For The Key To Be Searched

        System.out.println("Enter The Number You Want To Search");
        int key = sc.nextInt();

        binarySearchAlgo(arr,key);

        sc.close();
    }
}
