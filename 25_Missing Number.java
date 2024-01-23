/* Problem Statement :-
Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.
*/

// Answer :-

class Solution {
    public int missingNumber(int[] nums) {
        int sum=0;
        int N=nums.length;
        Arrays.sort(nums);
        for(int i=0; i<nums.length; i++){
         sum = sum + nums[i];   
        }
        int tot = (N*(N+1))/2;
        int ret = tot-sum;
        return ret;
    }
}
