package array2d;
import java.util.Scanner;

public class searchInSorted2dArray {

    public static void searchInArray(int arr[][], int key){

        int i = 0;
        int j = arr.length -1;
        boolean flag = false;
        while(j >= 0 && i < arr.length)
        {
            if(key == arr[i][j]){
                System.out.println("Element Found !");
                flag = true;
                break;
            }
            else if (key > arr[i][j]) 
            {
                i++;
            } 
            else
            {
                j--;
            }
        }
        if(flag == false){
            System.out.println("Element Nahi Mila Sorry :(");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Numbers of Rows in 2d Array : ");
        int n = sc.nextInt();
        System.out.println("Enter The Numbers of Columns in 2d Array : ");
        int m = sc.nextInt();

        // Creating Array Of The Given Size
        int arr[][] = new int[n][m];

        // Taking Input Inside The Array

        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < m; j++) 
            {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter The Number To Be Searched :- ");
        int key = sc.nextInt();

        // Printing The Array Array
        searchInArray(arr,key);

        sc.close();
    }
}
