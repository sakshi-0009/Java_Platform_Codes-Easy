/* Problem Statement :-
Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
Note that you must do this in-place without making a copy of the array.
*/

// Answer :-

class Solution {
    public void moveZeroes(int[] nums) {
        int i = 0;
        int insertPoint = 0;
        int n = nums.length;
        while (i < n){
            if(nums[i] != 0){
                nums[insertPoint++] = nums[i];
            }
            i++;
        }
        while (insertPoint < n){
            nums[insertPoint] = 0;
            insertPoint++;
        }
    }
}
