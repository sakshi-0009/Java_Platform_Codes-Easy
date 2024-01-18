/* Problem Statement :-
Given an array arr[] of size N containing equal number of odd and even numbers. Arrange the numbers in such a way that all the even numbers get the even index and odd numbers get the odd index.
Note: There are multiple possible solutions, Print any one of them. Also, 0-based indexing is considered.
*/

// Answer :-

class Solution {
    static void reArrange(int[] arr, int N) {
        int evenInd = 0;
        int oddInd = 1;

        while (evenInd < N && oddInd < N) {
            while (evenInd < N && arr[evenInd] % 2 == 0)
                evenInd += 2;

            while (oddInd < N && arr[oddInd] % 2 == 1)
                oddInd += 2;

            if (evenInd < N && oddInd < N) {
                int temp = arr[evenInd];
                arr[evenInd] = arr[oddInd];
                arr[oddInd] = temp;
            }
        }
    }

    static void printArray(int arr[], int N) {
        for (int i = 0; i < N; i++)
            System.out.print(arr[i] + " ");
    }
}
