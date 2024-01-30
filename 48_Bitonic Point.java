/* Probelm Statement :-
Given an array arr of n elements that is first strictly increasing and then maybe strictly decreasing, find the maximum element in the array.
Note: If the array is increasing then just print the last element will be the maximum value.
*/

// Answer :-

class Solution {
    int findMaximum(int[] arr, int n) {
        if (n == 0) {
            return -1;
        }

        if (n == 1 || arr[0] > arr[1]) {
            return arr[0];
        }

        if (arr[n - 1] > arr[n - 2]) {
            return arr[n - 1];
        }

        int low = 0, high = n - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] > arr[mid + 1] && arr[mid] > arr[mid - 1]) {
                return arr[mid];
            } else if (arr[mid] > arr[mid + 1]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
}
