/* Problem Statement :-
Given an array arr[] of size n, find the first repeating element. The element should occur more than once and the index of its first occurrence should be the smallest.
Note:- The position you return should be according to 1-based indexing. 
*/

// Answer :-

import java.util.*;

public class GFG {
	public static int firstRepeatingElement(int[] arr, int n) {
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (arr[i] == arr[j]) {
					return i;
				}
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] arr = { 10, 5, 3, 4, 3, 5, 6 };
		int n = arr.length;
		int index = firstRepeatingElement(arr, n);
		if (index == -1) {
			System.out.println("No repeating element found!");
		}
		else {
			System.out.println(arr[index]);
		}
	}
}
