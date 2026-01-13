class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int profit = 0;
        for(int i : prices){
            if(i<minPrice){
                minPrice = i;
            }
            else{
                profit = Math.max(profit, i - minPrice);
            }
        }
        return profit;
    }
}