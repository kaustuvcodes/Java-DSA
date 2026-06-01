/*
LeetCode 88 - Merge Sorted Array

Time Complexity: O(m + n)
Space Complexity: O(1)

Approach:
1. Start from the end of both arrays.
2. Compare elements and place the larger one at the end of nums1.
3. Continue until all elements of nums2 are merged.
*/

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int kaustuv = m - 1;
        int mahi = n - 1;
        int idx = m + n - 1;

        while(kaustuv >= 0 && mahi >= 0) {

            if(nums1[kaustuv] > nums2[mahi]) {
                nums1[idx] = nums1[kaustuv];
                kaustuv--;
            } else {
                nums1[idx] = nums2[mahi];
                mahi--;
            }

            idx--;
        }

        while(mahi >= 0) {
            nums1[idx] = nums2[mahi];
            mahi--;
            idx--;
        }
    }
}