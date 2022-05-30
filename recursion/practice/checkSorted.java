package recursion.practice;

public class checkSorted {

    public static boolean checker(int arr[], int i)
    {
        // BASE CASE

        if(i == arr.length-1)
        {
            return true;
        }

        // MY WORK
        if(arr[i] < arr[i+1])
        {
            // FAITH
            return checker(arr,i+1);
        }
        else
        {
            return false;
        }

    }
    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(checker(arr,0));
    }
}
