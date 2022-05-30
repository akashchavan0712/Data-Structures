// package leetcode;

// import java.util.*;

// public class leetcode34 {

//     int binarySearch(int arr[], int x)
//     {
//         int l = 0, r = arr.length - 1;
//         while (l <= r) {
//             int m = l + (r - l) / 2;
 
//             // Check if x is present at mid
//             if (arr[m] == x)
//                 return m;
 
//             // If x greater, ignore left half
//             if (arr[m] < x)
//                 l = m + 1;
 
//             // If x is smaller, ignore right half
//             else
//                 r = m - 1;
//         }
//         return -1;
//     }

//     public static void main(String[] args) 
//     {
//         int arr[] = {5, 11, 17, 25, 49, 77, 101};
//         int target = 9;
//     }
// }
