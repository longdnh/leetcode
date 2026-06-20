package com.longdnh.dsa.string_array.longest_common_prefix;

public class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder longestCommonPrefix = new StringBuilder();
        String prefix = strs[0];
        int prefLen = prefix.length();
        for (int i=1;i<strs.length;i++){
            String s = strs[i];
            while(prefLen > s.length() || !prefix.equals(s.substring(0, prefLen))){
                prefLen--;
                if (prefLen == 0) return "";
                prefix = prefix.substring(0, prefLen);
            }
        }
        return prefix;
    }
}
// my solution

//class Solution {
//    public String longestCommonPrefix(String[] strs) {
//        StringBuilder longestCommonPrefix = new StringBuilder();
//        for (int i = 0; i < strs[0].length(); i++) {
//            char c = strs[0].charAt(i);
//            for (int j = 1; j < strs.length; j++) {
//                if (i >= strs[j].length() || strs[j].charAt(i) != c) {
//                    return longestCommonPrefix.toString();
//                }
//            }
//            longestCommonPrefix.append(c);
//        }
//        return longestCommonPrefix.toString();
//    }
//}