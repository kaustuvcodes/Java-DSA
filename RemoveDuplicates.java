// LeetCode 26 - Remove Duplicates from Sorted Array
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public int removeDuplicates(int[] nums) {

        int kaustuv = 1;

        for(int i = 1; i < nums.length; i++) {

            if(nums[i] != nums[i - 1]) {

                nums[kaustuv] = nums[i];
                kaustuv++;
            }
        }

        return kaustuv;
    }
}