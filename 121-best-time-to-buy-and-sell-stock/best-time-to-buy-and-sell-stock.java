class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int minPrice = Integer.MAX_VALUE;

        for(int i : prices){
            minPrice = Math.min(minPrice, i);
            profit = Math.max(profit, i - minPrice);
        }
        return profit;
    }
}