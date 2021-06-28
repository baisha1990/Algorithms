/*Given a string s, find the length of the longest substring without repeating characters.

Example 1:
Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.

Example 2:
Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.

Example 3:
Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.

Example 4:
Input: s = ""
Output: 0

Constraints:

0 <= s.length <= 5 * 104
s consists of English letters, digits, symbols and spaces.*/


class Solution {
    public int lengthOfLongestSubstring(String s) {
        int wS = 0, l = Integer.MIN_VALUE;
        int[] carr = new int[128];
        for(int wE = 0; wE < s.length(); wE++) {
            carr[s.charAt(wE)]++;
            while(carr[s.charAt(wE)] > 1) {
                carr[s.charAt(wS)]--;
                wS++;
            }
            l = Math.max(l, wE - wS + 1);
        }
        return l == Integer.MIN_VALUE ? 0 : l;
    }
}

