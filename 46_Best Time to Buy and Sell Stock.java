/* Problem Statement :-
You are given an array prices where prices[i] is the price of a given stock on the ith day.
You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
*/

// Answer :-

class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int delta = 0;
        for (int i = prices.length-1; i >= 0; i--) {
            if (prices[i] >= max) {
                max = prices[i];
            } else {
                delta = Math.max(max - prices[i], delta);
            }
        }
        return delta;
    }
}
