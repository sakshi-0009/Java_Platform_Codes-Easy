/* Problem Statement :-
Given two arrays of A and B respectively of sizes N1 and N2, the task is to calculate the product of the maximum element of the first array and minimum element of the second array.
*/

// Answer :-

class Solution{
    
    public static long find_multiplication (int arr[], int brr[], int n, int m) {
        int maxA = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            maxA = Math.max(maxA, arr[i]);
        }

        int minB = Integer.MAX_VALUE;
        for (int i = 0; i < m; i++) {
            minB = Math.min(minB, brr[i]);
        }

        return (long) maxA * minB;
    }
}
