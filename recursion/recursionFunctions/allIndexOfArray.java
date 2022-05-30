package recursion.recursionFunctions;
import java.util.ArrayList;

public class allIndexOfArray 
{
    public static int[] allIndices(int arr[], int x, int i, int count)
    {
        // Base Case
        if(i == arr.length)
        {
            return new int[count];
        }
        if(arr[i] == x)
        {
            int arr1[] = allIndices(arr,x,i+1,count+1);
            arr1[count] = i;
            return arr1;
        }
        else
        {
            int arr1[] = allIndices(arr,x,i+1,count);
            return arr1;
        }
    }

    public static ArrayList<Integer> allIndex(int arr[],ArrayList<Integer> arr1,int x,int i)
    {
        // Base Case
        if(i == arr.length)
        {
            return arr1;
        }
        // MyWork
        if(arr[i] == x)
        {
            arr1.add(i);
        }
        // Faith
        allIndex(arr,arr1,x,i+1);
        return arr1;
    }
    public static void main(String[] args) 
    {

        int x = 11;
        int arr[] = {11,24,74,25,11,49,28,11,16,12};
        
        // Creating An ArrayList
        // ArrayList <Integer> array = new ArrayList<Integer>();
        // System.out.println(allIndex(arr,array,x,0));
        int[] arr1 = allIndices(arr,x,0,0);
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }

    }
}
