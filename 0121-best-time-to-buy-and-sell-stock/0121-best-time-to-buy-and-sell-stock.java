class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0, min = prices[0];
        int cost;
        for(int i=1;i<prices.length;i++){
            cost = prices[i] - min;
            profit = Math.max(profit, cost);
            min = Math.min(min, prices[i]);
        }
        return profit;
    }
}