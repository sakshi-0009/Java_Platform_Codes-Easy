/* Problem Statement :-
Given an array of strings words, return the first palindromic string in the array. If there is no such string, return an empty string "".
A string is palindromic if it reads the same forward and backward.
 */

//Answer :-

class Solution {
    public String firstPalindrome(String[] words) {
        int n=words.length;
        
        for(int i=0;i<n;i++){
            if(isPalindrome(words[i])) return words[i];
        }
        return "";
    }
    public boolean isPalindrome(String word){
        int i=0;
        int j=word.length()-1;
        while(i<j){
            if(word.charAt(i)!=word.charAt(j)){
                return false; 
            }
            i++;j--;
        }
        return true;
    }
}
