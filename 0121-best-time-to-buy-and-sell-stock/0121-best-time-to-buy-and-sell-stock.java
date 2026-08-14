class Solution {
    public int maxProfit(int[] prices) {
        int lowestPrice = prices[0];
        int profit = 0;
        for(int price : prices){
            if(price < lowestPrice){
                lowestPrice = price;
            }
            profit = Math.max(profit, price - lowestPrice);
        }
        return profit;
    }
}