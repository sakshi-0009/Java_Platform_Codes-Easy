/* Problem Statement :-
Given an array of N integers, and an integer K, find the number of pairs of elements in the array whose sum is equal to K.
*/

//Answer :-

class Solution {
    int getPairsCount(int[] arr, int n, int k) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            freqMap.put(arr[i], freqMap.getOrDefault(arr[i], 0) + 1);
        }
        int countPairs = 0;
        for (int i = 0; i < n; i++) {
            int complement = k - arr[i];

            if (freqMap.containsKey(complement)) {
                countPairs += freqMap.get(complement);
            }

            if (complement == arr[i]) {
                countPairs--;
            }
        }
        return countPairs / 2;
    }
}
