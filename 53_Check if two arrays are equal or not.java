/* problem Statement :-
Given two arrays A and B of equal size N, the task is to find if given arrays are equal or not. Two arrays are said to be equal if both of them contain same set of elements, arrangements (or permutation) of elements may be different though.
Note : If there are repetitions, then counts of repeated elements must also be same for two array to be equal.
*/

// Answer :-

class Solution{
    public static boolean check(long A[],long B[],int N) {
        
        if (A.length != B.length) {
            return false;
        }

        Map<Long, Integer> frequencyA = new HashMap<>();
        
        Map<Long, Integer> frequencyB = new HashMap<>();

        for (long num : A) {
            frequencyA.put(num, frequencyA.getOrDefault(num, 0) + 1);
        }

        for (long num : B) {
            frequencyB.put(num, frequencyB.getOrDefault(num, 0) + 1);
        }

        return frequencyA.equals(frequencyB);
    }
}
