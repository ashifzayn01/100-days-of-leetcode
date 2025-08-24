/*Given a string s, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.

 

Example 1:

Input: s = "Let's take LeetCode contest"
Output: "s'teL ekat edoCteeL tsetnoc"
Example 2:

Input: s = "Mr Ding"
Output: "rM gniD"*/

class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < words.length;i++){
            StringBuilder str = new StringBuilder(words[i]);
            str.reverse();
            result.append(str);

            if(i < words.length-1){
                result.append(" ");

            }
        }
        return result.toString();
       
        
    }
}
