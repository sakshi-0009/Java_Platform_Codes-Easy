/* Problem Statement :-
Given an array of integers (A[])  and a number x, find the smallest subarray with sum greater than the given value. If such a subarray do not exist return 0 in that case.
*/

// Answer :-

class Solution {

    public static int smallestSubWithSum(int a[], int n, int x) {
        int minLen = Integer.MAX_VALUE;
        int currSum = 0;
        int start = 0;

        for (int end = 0; end < n; end++) {
            currSum += a[end];

            while (currSum > x) {
                minLen = Math.min(minLen, end - start + 1);

                currSum -= a[start];
                start++;
            }
        }

        if (minLen == Integer.MAX_VALUE) {
            return 0;
        } else {
            return minLen;
        }
    }
}
