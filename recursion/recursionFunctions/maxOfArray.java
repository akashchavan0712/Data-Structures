package recursion.recursionFunctions;

public class maxOfArray {

    public static int display(int arr[],int i)
    {
        // Base Case
        if(i == arr.length){
            return Integer.MIN_VALUE;
        }

        // My Work
        
        int value = display(arr,i+1);
        int max = Math.max(value,arr[i]);

        // Expectation/Faith
        return max;

    }
    
    public static void main(String[] args) 
    {
        int arr[] = {5,10,15,20,25,30,40,50};
        System.out.println(display(arr,0));
    }
}
