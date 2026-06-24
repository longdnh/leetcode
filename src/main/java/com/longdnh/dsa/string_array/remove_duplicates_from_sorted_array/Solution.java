package com.longdnh.dsa.string_array.remove_duplicates_from_sorted_array;

class Solution {
    public int searchInsert(int[] nums, int target) {
        if(nums == null || nums.length == 0 || target <= nums[0] ) return 0;

        for(int i = 0; i < nums.length; i++){
            if(i == nums.length-1){
                if (target == nums[i]) return i;
                return nums.length;
            }

            if (nums[i]<target && nums[i+1]>target){
                return i+1;
            }else if(nums[i]==target){
                return i;
            }
        }

        return nums.length;
    }
}