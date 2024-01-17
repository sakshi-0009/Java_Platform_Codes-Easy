/* Problem Statement :-
Given an array A of positive integers. Your task is to find the leaders in the array.
An element of array is a leader if it is greater than or equal to all the elements to its right side. The rightmost element is always a leader. 
*/

// Answer :-

class Solution{
    static ArrayList<Integer> leaders(int arr[], int n){
        int mx = arr[n - 1];
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(mx);
        
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] < mx) {
                continue;
            }
            mx = arr[i];
            ans.add(mx);
        }
        ArrayList<Integer> reversedAns = new ArrayList<>();
        for (int i = ans.size() - 1; i >= 0; i--) {
            reversedAns.add(ans.get(i));
        }
        return reversedAns;
    }
}
