package arrays;
import java.util.Scanner;

public class barChart {

    public static void createBarGraph(int arr[], int size, int max){
        for (int i = max; i > 0; i--) {
            for (int j = 0; j < size; j++) {
                if (i > arr[j])
                {
                    System.out.print("\t");
                }
                else{
                    System.out.print("***\t");
                }
            }
            System.out.println();
        }
    } 
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number of Bars in The Bar Graph : ");
        int n = sc.nextInt();
        int array [] = new int[n];
        int max = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("Enter The Size of the bar "+(i+1)+" ");
            array[i] = sc.nextInt();
            if(array[i] > max){
                max = array[i];
            }
        }
        sc.close();
        createBarGraph(array, n, max);
    }
}
