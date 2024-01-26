/* Problem Statement :-
Given two arrays: a1[0..n-1] of size n and a2[0..m-1] of size m. Task is to check whether a2[] is a subset of a1[] or not. Both the arrays can be sorted or unsorted. There can be duplicate elements.
*/

// Answer :-

class Compute {
    public String isSubset( long a1[], long a2[], long n, long m) {
        
        Map<Long, Integer> frequencyMap = new HashMap<>();
        for (long num : a1) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        for (long num : a2) {
            if (!frequencyMap.containsKey(num) || frequencyMap.get(num) <= 0) {
                return "No";
            }
            frequencyMap.put(num, frequencyMap.get(num) - 1);
        }

        return "Yes";
    }
}
