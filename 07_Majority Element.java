/* Problem Statement :-
  Given an array nums of size n, return the majority element.
The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
*/

// Answer :-

class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int solution = nums[0];
        for(int i = 0;i<nums.length;i++){
            if(count == 0){
                solution = nums[i];
            }
            if(nums[i] == solution){
                count++;
            } else{
                count--;
            }
            if(count > nums.length/2){
                return solution;
            }
        System.out.println(solution);
        }
        return solution;
    }
}
