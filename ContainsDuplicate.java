// LeetCode 217 - Contains Duplicate

// Time Complexity: O(n)
// Space Complexity: O(n)

import java.util.HashSet;

class Solution {
    public boolean containsDuplicate(int[] nums) {

        HashSet<Integer> kaustuv = new HashSet<>();

        for(int i = 0; i < nums.length; i++) {

            if(kaustuv.contains(nums[i])) {
                return true;
            }

            kaustuv.add(nums[i]);
        }

        return false;
    }
}