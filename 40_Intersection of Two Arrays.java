/* Problem Statement :-
Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must be unique and you may return the result in any order.
*/

// Answer :-

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> res = new HashSet<Integer>();
         for (int i :nums1){
             for (int j : nums2){
                 if (i ==j){
                     res.add(i);
                 }
             }
         }
         int[] arr = new int[res.size()];
        int i=0; 
        
        // iterating over the hashset 
        for(int ele:res){ 
          arr[i++] = ele; 
        } 
       return arr;
    }
}
