/* Problem Statement :-
Given are the heights of certain Buildings which lie adjacent to each other. Sunlight starts falling from the left side of the buildings.
If there is a building of a certain Height, all the buildings to the right side of it having lesser heights cannot see the sun.
The task is to find the total number of such buildings that receive sunlight.
*/

// Answer :-

class Solution {

    public static int longest(int arr[],int n) {
       
        int count = 1;
        int maxHeight = arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] >= maxHeight) {
                count++;
                maxHeight = arr[i];
            }
        }
        return count;
    }
}
