package recursion.recursionFunctions;

public class displayArrayReverse {

    public static void display(int arr[],int i)
    {
        // Base Case
        if(i == arr.length){
            return;
        }

        // Expectation/Faith
        display(arr,i+1);

        // My Worker
        System.out.println(arr[i]);

    }
    public static void main(String[] args) {

        int arr[] = {5,10,15,20,25,30,40,50};
        display(arr,0);
    }
}
