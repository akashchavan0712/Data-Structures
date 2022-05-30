package leetcode;

public class addArrayandNumber 
{
    public static void main(String[] args) 
    {
        int arr[] = {1,2,0,0};
        int k = 34;
        int power = 1;
        int number = 0;
        for (int i = arr.length-1; i >= 0; i--) {
            number = number + (power * arr[i]);
            power = power * 10;
        }
        int sum = number + k;
        System.out.println("sum is : "+sum);
    }
}
