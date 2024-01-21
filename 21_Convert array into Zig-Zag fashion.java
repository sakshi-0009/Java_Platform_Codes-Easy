/* Problem Statement :-
Given an array arr of distinct elements of size N, the task is to rearrange the elements of the array in a zig-zag fashion so that the converted array should be in the below form: 
*/

// Answer :-

class Solution{
    public void zigZag(int arr[], int n){

        for (int i = 0; i < n - 1; i++) {
            if (i % 2 == 0 && arr[i] > arr[i + 1]) {
                swap(arr, i, i + 1);
            }
            else if (i % 2 != 0 && arr[i] < arr[i + 1]) {
                swap(arr, i, i + 1);
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
