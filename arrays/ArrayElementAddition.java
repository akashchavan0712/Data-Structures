package arrays;
import java.util.Scanner;

public class ArrayElementAddition {

    public static void arrayAddition(int arr1[], int arr2[], int size1, int size2, int size3){

        // Getting Last Digits of the both arrays

        int array[] = new int[size3];
        size3 = size3 -1;
        int maxsize = size3; 
        int carry = 0;
        
        // Main Condition For Loop To Go on Array

        while(size3 >= 0){

            int sum = 0;
            if(size1 >= 0){
                sum += arr1[size1];
            }
            if(size2 >= 0){
                sum += arr2[size2];
            }

            sum+= carry;

            int rem = sum % 10;
            int quo = sum /10;

            array[size3] = rem;
            carry = quo;

            size1--;
            size2--;
            size3--;
        }

        int result = 0;
        int power = 1;
        for (int i = maxsize; i >= 0; i--) {
            result = result + (array[i] * power);
            power*=10;
        }
        System.out.println("The Result is : "+result);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int maxsize = 0;
        System.out.println("Enter The Size of The Array1 : ");
        int size1 = sc.nextInt();
        maxsize = size1;
        System.out.println("Enter The Size of The Array2 : ");
        int size2 = sc.nextInt();

        if (size2 > size1){
            maxsize = size2;
        }
        
        int array1[] = new int[size1];
        int array2[] = new int[size2];

        for (int i = 0; i < size1; i++) {
            System.out.println("Enter The Elements in Array1 : ");
            array1[i] = sc.nextInt();
        }

        for (int i = 0; i < size2; i++) {
            System.out.println("Enter The Elements in Array2 : ");
            array2[i] = sc.nextInt();
        }
        int size3 = maxsize + 1;
        arrayAddition(array1, array2, (size1-1), (size2-1), size3);
        sc.close();

    }
}
   