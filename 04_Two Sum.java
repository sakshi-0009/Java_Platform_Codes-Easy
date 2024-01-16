/* Problem Statement :-
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.
*/

// Answer :-

class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i=1; i<nums.length; i++){
            for (int j=0 ; i+j<nums.length; j++){
                if(nums[i+j]+nums[j] == target){
                   return new int[] {i+j,j} ;
                }
            }
        }
        return new int[] {};
    }
}
