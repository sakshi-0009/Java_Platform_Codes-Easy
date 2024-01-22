/* Problem Statement :-
Given an unsorted array Arr of N positive and negative numbers. Your task is to create an array of alternate positive and negative numbers without changing the relative order of positive and negative numbers.
Note: Array should start with a positive number and 0 (zero) should be considered a positive element.
*/

// Answer :-

class Solution {
    void rightrotate(int arr[], int n, int outofplace, int cur) {
        int tmp = arr[cur];
        for (int i = cur; i > outofplace; i--) {
            arr[i] = arr[i - 1];
        }
        arr[outofplace] = tmp;
    }

    void rearrange(int arr[], int n) {
        int outofplace = -1;

        for (int index = 0; index < n; index++) {
            if (outofplace >= 0) {
                if (((arr[index] >= 0) && (arr[outofplace] < 0))
                        || ((arr[index] < 0) && (arr[outofplace] >= 0))) {
                    rightrotate(arr, n, outofplace, index);

                    if (index - outofplace >= 2) {
                        outofplace = outofplace + 2;
                    } else {
                        outofplace = -1;
                    }
                }
            }

            if (outofplace == -1) {
                if (((arr[index] >= 0) && ((index & 0x01) == 0))
                        || ((arr[index] < 0) && ((index & 0x01) == 1))) {
                    outofplace = index;
                }
            }
        }
    }

    void printArray(int arr[], int n) {
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        System.out.println("");
    }
}
