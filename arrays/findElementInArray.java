package arrays;
import java.util.Scanner;

public class findElementInArray {

    public static int isElementInArray(int arr[], int key, int size){
        for(int j = 0 ; j < size ; j++){
            if(arr[j] == key){
                return j;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Length of the Array : ");
        int n = sc.nextInt();
        int array[] = new int[n];

        int i = 0;
        int cx = 1;
        while(i < n){
            System.out.println("Enter Element "+cx+" : ");
            array[i] = sc.nextInt(); 
            i++;
            cx++;
        }

        System.out.println("Which Element Would You Like To Search : ");
        int key = sc.nextInt();
        int x = isElementInArray(array,key, n);

        if (x > 0){
            System.out.println("Yes , the element is present at index : "+x );
        }
        else{
            System.out.println("Element you are searching for is not to be found");
        }
        sc.close();
    }
}
