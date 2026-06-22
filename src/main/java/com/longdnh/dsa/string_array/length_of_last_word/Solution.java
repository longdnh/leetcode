package com.longdnh.dsa.string_array.length_of_last_word;

public class Solution {
    public int lengthOfLastWord(String s) {
         String[] arr = s.trim().split(" ");
         return arr[arr.length - 1].length();
    }
}
