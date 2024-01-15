/* Problem Statement :-
Given an array Arr of N positive integers and another number X. Determine whether or not there exist two elements in Arr whose sum is exactly X.
*/

// Answer :-

class Solution {
    boolean hasArrayTwoCandidates(int A[], int arr_size, int sum) {
        int l, r;
        Arrays.sort(A);
        l = 0;
        r = arr_size - 1;
        while (l < r) {
            if (A[l] + A[r] == sum)
                return true;
            else if (A[l] + A[r] < sum)
                l++;
            else
                r--;
        }
        return false;
    }
}
