/* Problem Statement :-
Write a function to find the longest common prefix string amongst an array of strings.
If there is no common prefix, return an empty string "".
*/

// Answer :-

class Solution {

    public String longestCommonPrefix(String[] strs) {
        int i = 0;
        if(strs.length == 0 ) return "";
        if(strs.length == 1) return strs[0];
        while(true){
            for(int j = 1; j < strs.length; j++ ){
                String prev = strs[j-1];
                String cur = strs[j];
                if( prev.length() == 0 ||  prev.length() <= i || cur.length() <= i ||
                                prev.charAt(i)!= cur.charAt(i)){
                    return prev.substring(0,i);
                }
            }
            i = i + 1;
        }
    }
}
