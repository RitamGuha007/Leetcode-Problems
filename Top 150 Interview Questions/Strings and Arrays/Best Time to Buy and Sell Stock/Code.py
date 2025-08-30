class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = prices[0];  // best buy price so far
        int maxProfit = 0;         // best profit so far

        for (int i = 1; i < prices.length; i++) {
            // if we find a cheaper price, update buy price
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } 
            // otherwise, calculate profit and update maxProfit
            else {
                maxProfit = Math.max(maxProfit, prices[i] - minPrice);
            }
        }

        return maxProfit;
    }
}
