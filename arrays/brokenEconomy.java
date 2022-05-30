package arrays;
import java.util.Scanner;

public class brokenEconomy {

    public static int floor(int arr[], int idx){
        int floor = 0;
        if((idx - 1) > 0){
            floor = arr[idx-1];
            return floor;
        }
        return -1;
    }

    public static int ceil(int arr[], int idx){
        int ceil = 0;
        int last = arr.length-1;
        if((idx + 1) <= last){
            ceil = arr[idx+1];
            return ceil;
        }
        return -1;
    }

    public static int binarySearch(int arr[], int left, int right, int key){

        while(left <= right){

            int mid = (left + right) / 2;
            if(arr[mid] == key){
                return mid;
            }
            else if(arr[mid] > key){
                right = mid - 1;
            }
            else{
                left = mid + 1;
            }
        }
        return -1;
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

        int elementIndex = binarySearch(arr,0,(n-1),k);

        System.out.println("Element Present at : "+elementIndex);

        int floor = floor(arr,elementIndex);
        int ceil = ceil(arr,elementIndex);

        if(floor >= 0){
            System.out.println("Floor For Given Value is "+floor);
        }
        if(ceil >= 0){
            System.out.println("Ceil For Given Value is "+ceil);
        }
        
        sc.close();

    }
}
