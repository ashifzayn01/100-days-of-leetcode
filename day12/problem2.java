/*A pangram is a sentence where every letter of the English alphabet appears at least once.

Given a string sentence containing only lowercase English letters, return true if sentence is a pangram, or false otherwise.

 

Example 1:

Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
Output: true
Explanation: sentence contains at least one of every letter of the English alphabet.
Example 2:

Input: sentence = "leetcode"
Output: false*/

class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean[] seen = new boolean[26];
        for(int i = 0; i < sentence.length();i++){
            char ch = sentence.charAt(i);
            seen[ch - 'a'] = true;

           
        }
        for(int i = 0; i < seen.length;i++){
            if(!seen[i])
            return false;
        }
        return true;
        
    }
}
