package array2d;
import java.util.Scanner;

public class ringRotate{

    public static int[] spiralTraversal(int arr[][] , int n, int s)
    {
        int count = 0;
        int cmax = arr.length - s;
        int rmax = arr.length - s;
        int cmin = s-1;
        int rmin = s-1;
        int newsize = 2 * (cmax - cmin) + 2 * (rmax - rmin);
        int array[] = new int[newsize];

        // Left Column
        for (int i = rmin; i <= rmax ; i++) {
            array[count] = arr[i][cmin];
            count++;            
        }
        cmin++;

        // Bottom Column
        for (int i = cmin; i <= cmax ; i++) {
            array[count] = arr[rmax][i];
            count++;
        }
        rmax--;

        // Right Column
        for (int i = rmax; i >= rmin ; i--) {
            array[count] = arr[i][cmax];
            count++;
        }
        cmax--;

        // Top Column
        for (int i = cmax; i >= cmin; i--) {
            array[count] = arr[rmin][i];
            count++;
        }
        rmin++;           
        return array;
    }

    public static int[][] spiralTraversalFiller(int arr[][],int array[],int s)
    {
        int cmax = arr.length - s;
        int rmax = arr.length - s;
        int cmin = s-1;
        int rmin = s-1;
        int index = 0;
        
        // Left Column
        for (int i = rmin; i <= rmax ; i++) 
        {
            arr[i][cmin] = array[index];
            index++;         
        }
        cmin++;

        // Bottom Column
        for (int i = cmin; i <= cmax ; i++) {
            arr[rmax][i] = array[index];
            index++;
        }
        rmax--;

        // Right Column
        for (int i = rmax; i >= rmin ; i--) {
            arr[i][cmax] = array[index] ;
            index++;
        }
        cmax--;

        // Top Column
        for (int i = cmax; i >= cmin; i--) {
            arr[rmin][i] = array[index];
            index++;
        }
        rmin++;

        return arr;
    }
    
    public static void reverseArray(int arr[], int left, int right)
    {
        while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    public static int[] rotateArray(int arr1[], int k){

        k = k % arr1.length;

        if(k < 0){
            k = k + arr1.length;
        }

        reverseArray(arr1,0,arr1.length-1);
        reverseArray(arr1,0,k-1);
        reverseArray(arr1,k,arr1.length-1);

        return arr1;
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Length of The Whole Matrix : ");
        int n = sc.nextInt();

        // Creating A 2-D Array Matrix

        int arr[][] = new int[n][n];

        // Taking input inside the array2d

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) 
            {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter The Shell Number");
        int s = sc.nextInt();

        System.out.println("Enter The kth rotation");
        int r = sc.nextInt();

        // First Taking The 1D Array
        int array[] = spiralTraversal(arr,n,s);

        // Rotating The array
        int rArray[] = rotateArray(array,r);

        int finalArray[][] = spiralTraversalFiller(arr , rArray,s);

        System.out.println("Entering rotated array : ");
        for (int i = 0; i < finalArray.length; i++) 
        {
            for (int j = 0; j < finalArray[0].length; j++) {
                System.out.println(finalArray[i][j]);
            }
        }
        
        sc.close();

    }
}
