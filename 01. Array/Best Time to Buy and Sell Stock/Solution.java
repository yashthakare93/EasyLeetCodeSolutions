public class Solution {
    public int maxProfit(int[] prices) {
        // Initialize the buy price to the first price in the array
        int buy_price = prices[0];
        
        // Initialize current profit and maximum profit to 0
        int current_profit = 0, max_profit = 0;

        // Loop through the prices starting from the second day (index 1)
        for (int i = 1; i < prices.length; i++) {
            // If we find a price lower than the current buy price, update buy price
            if (prices[i] < buy_price) {
                buy_price = prices[i];
            } else {
                // Calculate the current profit by subtracting buy price from the current price
                current_profit = prices[i] - buy_price;
                
                // Update the maximum profit if current profit is higher
                max_profit = Math.max(current_profit, max_profit);
            }
        }
        
        // Return the maximum profit found
        return max_profit;
    }
}



