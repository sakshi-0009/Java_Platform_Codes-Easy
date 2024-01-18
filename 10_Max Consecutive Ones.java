/* Problem Statement :-
Given a binary array nums, return the maximum number of consecutive 1's in the array.
*/

// Answer :-

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int sum = 0;
        int k = 0;
        for(int  i=0;i<nums.length;i++){
            if(nums[i]==1){
                sum++;
            } else {
                sum=0;
            }
            if(sum>k){
                k=sum;
            }
        }
        return k;
    }
}
