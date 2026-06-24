package com.longdnh.dsa.string_array.container_with_most_water;

public class Solution {
    public int maxArea(int[] height) {
        int maxValue = 0;
        int left = 0;
        int right = height.length - 1;
        while(left < right) {
            maxValue = Math.max(maxValue, Math.min(height[left], height[right]) * (right - left));
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxValue;
    }
}
