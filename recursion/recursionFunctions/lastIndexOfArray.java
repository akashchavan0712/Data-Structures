package recursion.recursionFunctions;

public class lastIndexOfArray 
{
    public static int lastIndex(int arr[],int x,int i)
    {
        // Base Case
        if(i == arr.length)
        {
            return -1;
        }

        // Faith
        int r1 =  lastIndex(arr,x,i+1);

        if (r1 == -1)
        {
            if(arr[i] == x)
            {
                return i;
            }
            else{
                return -1;
            }
        }
        else
        {
            return r1;
        }
    }
    public static void main(String[] args) 
    {
        int x = 7;
        int arr[] = {1,2,3,7,6,5,5,7,5,15};
        System.out.println(lastIndex(arr,x,0));
    }
}
