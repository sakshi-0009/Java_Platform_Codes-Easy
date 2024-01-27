/* Problem Statement :-
You are given an array a, of n elements. Find the minimum index based distance between two distinct elements of the array, x and y. Return -1, if either x or y does not exist in the array.
*/

// Answer :-

class Solution {
    int minDist(int a[], int n, int x, int y) {
        int lastIndexX = -1;
        int lastIndexY = -1;
        int minDistance = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if (a[i] == x) {
                lastIndexX = i;
                if (lastIndexY != -1) {
                    minDistance = Math.min(minDistance, lastIndexX - lastIndexY);
                }
            } else if (a[i] == y) {
                lastIndexY = i;
                if (lastIndexX != -1) {
                    minDistance = Math.min(minDistance, lastIndexY - lastIndexX);
                }
            }
        }

        if (lastIndexX == -1 || lastIndexY == -1) {
            return -1;
        }

        return minDistance;
    }
}
