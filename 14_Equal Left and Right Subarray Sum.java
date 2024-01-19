/* Problem Statement :-
Given an array A of n positive numbers. The task is to find the first index in the array such that the sum of elements before it is equal to the sum of elements after it.
Note:  Array is 1-based indexed.
*/

// Answer :-

class Solution{
	int equalSum(int [] A, int N) {
		int totalSum = 0;
        for (int num : A) {
            totalSum += num;
        }
        int leftSum = 0;

        for (int i = 0; i < N; i++) {
            totalSum -= A[i];

            if (leftSum == totalSum) {
                return i + 1;
            }

            leftSum += A[i];
        }
        return -1;
	}
}
