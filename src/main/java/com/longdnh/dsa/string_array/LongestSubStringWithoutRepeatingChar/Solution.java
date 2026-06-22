package com.longdnh.dsa.string_array.LongestSubStringWithoutRepeatingChar;

import java.util.HashSet;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i = 0, j =0;
        int maxLength = 0;
        HashSet<Character> set = new HashSet<>();
        while(j<s.length()){
            if(!set.contains(s.charAt(j))){
                set.add(s.charAt(j));
                maxLength = Math.max(maxLength, set.size());
                j++;
            }else{
                set.remove(s.charAt(i));
                i++;
            }
        }
        return maxLength;
    }
}
