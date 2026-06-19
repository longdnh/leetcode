package com.longdnh.dsa.valid_parenthese;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean isValid(String s) {

    if (s.length() % 2 != 0) return false;
    StringBuilder sb = new StringBuilder();
    Map<Character, Character> map = new HashMap<>();

    int j = 1;
    map.put('(', ')');
    map.put('{', '}');
    map.put('[', ']');
    for (int i=0; i<s.length(); i++) {
        if (sb.length() == 0 && map.containsValue(s.charAt(i))) return false;
        if (i == 0){
            sb.append(s.charAt(i));
            continue;
        }
        if(map.containsKey(s.charAt(i))){
            sb.append(s.charAt(i));
        }else{
            if(map.get(sb.charAt(i-j)) == s.charAt(i)){
                sb.deleteCharAt(sb.length()-1);
                j+=2;
            }else{
                return false;
            }
        }
    }
    return sb.length() == 0;
    }
}
