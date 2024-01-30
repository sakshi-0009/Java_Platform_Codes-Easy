/* Problem Statement :
Given a sorted array of size N and an integer K, find the position(0-based indexing) at which K is present in the array using binary search.
*/

// Answer :-

class Solution {
    int binarysearch(int arr[], int n, int k) {
        int low = 0, high = n - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == k) {
                return mid;
            } else if (arr[mid] < k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}
