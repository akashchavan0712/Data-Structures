package recursion.recursionFunctions;

public class firstIndexOfArray {

    public static int firstIndex(int arr[], int x,int i)
    {
        // Base Case
        if(i == arr.length)
        {
            return -1;
        }
        if(x == arr[i])
        {
            return i;
        }
        // Faith
        return firstIndex(arr,x,i+1);
    }
    public static void main(String[] args) 
    {
        int x = 15;
        int arr[] = {1,2,3,4,6,5,5,8,5,15};
        int a = firstIndex(arr,x,0);
        System.out.println(x+" is present at index : "+a);
    }
}
