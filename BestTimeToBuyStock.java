// LeetCode 121 - Best Time to Buy and Sell Stock
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public int maxProfit(int[] prices) {

        int kaustuv = prices[0];
        int profit = 0;

        for(int i = 1; i < prices.length; i++) {

            if(prices[i] < kaustuv) {
                kaustuv = prices[i];
            }

            int currentProfit = prices[i] - kaustuv;

            if(currentProfit > profit) {
                profit = currentProfit;
            }
        }

        return profit;
    }
}