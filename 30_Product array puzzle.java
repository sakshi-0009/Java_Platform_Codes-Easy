/* Problem Statement :-
Given an array nums[] of size n, construct a Product Array P (of same size n) such that P[i] is equal to the product of all the elements of nums except nums[i].
*/

// Answer :-

class Solution 
{ 
	public static long[] productExceptSelf(int nums[], int n) 
	{ 
        long[] result = new long[n];
    
        long[] leftProducts = new long[n];
        long[] rightProducts = new long[n];
        
        leftProducts[0] = 1;
        for (int i = 1; i < n; i++) {
            leftProducts[i] = leftProducts[i - 1] * nums[i - 1];
        }
        
        rightProducts[n - 1] = 1;
        for (int i = n - 2; i >= 0; i--) {
            rightProducts[i] = rightProducts[i + 1] * nums[i + 1];
        }
        
        for (int i = 0; i < n; i++) {
            result[i] = leftProducts[i] * rightProducts[i];
        }
        
        return result;
	} 
} 
