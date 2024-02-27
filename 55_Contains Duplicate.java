/* problem Statement :-
Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
*/

// Answer :-

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet <Integer> unique = new HashSet();
        for (int i = 0; i < nums.length; i++) {
            if (unique.contains(nums[i])) {
                return true;
            }
        unique.add(nums[i]);
        }
    return false;
    }
}
