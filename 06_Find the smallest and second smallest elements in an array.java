/* Prolem Statement :-
Given an array of integers, your task is to find the smallest and second smallest element in the array. If smallest and second smallest do not exist, print -1.
*/

// Answer :-

import java.io.*; 
class GFG { 
	public static void main(String args[]) 
	{ 
		int arr[] = { 12, 13, 1, 10, 34, 1 }; 
		int n = arr.length; 
		int smallest = Integer.MAX_VALUE; 
		for (int i = 0; i < n; i++) { 
			if (arr[i] < smallest) { 
				smallest = arr[i]; 
			} 
		} 
		System.out.println("smallest element is: "
						+ smallest); 

		int second_smallest = Integer.MAX_VALUE; 
		for (int i = 0; i < n; i++) { 
			if (arr[i] < second_smallest 
				&& arr[i] > smallest) { 
				second_smallest = arr[i]; 
			} 
		} 
		System.out.println("second smallest element is: "
						+ second_smallest); 
	} 
} 
