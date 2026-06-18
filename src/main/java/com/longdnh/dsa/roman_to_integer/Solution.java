package com.longdnh.dsa.roman_to_integer;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int romanToInt(String s) {
        // hashMap contain key and value
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int ans = map.get(s.charAt(s.length() - 1));
        for(int i = s.length() - 1; i >= 1; i--) {
            if (map.get(s.charAt(i)) <= map.get(s.charAt(i - 1))) {
                ans += map.get(s.charAt(i - 1));
            } else {
                ans -= map.get(s.charAt(i - 1));
            }
        }

        return ans;
    }
}
