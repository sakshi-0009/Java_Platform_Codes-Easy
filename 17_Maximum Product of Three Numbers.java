// Three Great candidates / Three Ninja Candidates

/* Problem Statement :-
Given an integer array nums, find three numbers whose product is maximum and return the maximum product.
*/

// Answer :-

class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int product1 = nums[n - 1] * nums[n - 2] * nums[n - 3];
        int product2 = nums[0] * nums[1] * nums[n - 1];
        return Math.max(product1, product2);
    }
}
