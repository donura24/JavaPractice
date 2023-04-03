package JavaPractice.Leetcode_3;


import com.google.gson.internal.bind.MapTypeAdapterFactory;

import java.util.HashMap;
import java.util.Map;

/*
3. Longest Substring Without Repeating Characters

Given a string s, find the length of the longest
substring
 without repeating characters.



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


Constraints:

0 <= s.length <= 5 * 104
s consists of English letters, digits, symbols and spaces.
 */
public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        Map<Character, Integer> chars = new HashMap<>();


        int left = 0;
        for (int right = 0; right < s.length(); right++) {
            char currChar = s.charAt(right);
            if (chars.containsKey(currChar) && chars.get(currChar) >= left) {
                left = chars.get(currChar) + 1;
            }
            maxLength = Math.max(maxLength, right - left + 1);
            chars.put(currChar, right);
        }
        return maxLength;
    }
}
