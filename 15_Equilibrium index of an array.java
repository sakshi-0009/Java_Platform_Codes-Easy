/* Problem Statement :-
Equilibrium index of an array is an index such that the sum of elements at lower indexes is equal to the sum of elements at higher indexes.
Given an array, your task is to find the index of first Equilibrium point in the array.
*/

// Answer :-

class GfG {
    public static int findEquilibrium(int arr[], int n) {
        int totalSum = 0;
        for (int num : arr) {
            totalSum += num;
        }
        
        int leftSum = 0;
        
        for (int i = 0; i < n; i++) {
            totalSum -= arr[i];
        
            if (leftSum == totalSum) {
                return i;
            }
        
            leftSum += arr[i];
        }
        
        return -1;
    }
}
