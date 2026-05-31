/*
LeetCode 1920 - Build Array from Permutation

Time Complexity: O(n)
Space Complexity: O(n)

Approach:
Create a new array and store nums[nums[i]]
at each index i.
*/

class Solution {
    public int[] buildArray(int[] nums) {

        int[] ans = new int[nums.length];

        for(int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }

        return ans;
    }
}