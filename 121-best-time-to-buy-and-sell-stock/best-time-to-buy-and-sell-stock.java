class Solution {
    public int maxProfit(int[] prices) {
        int minprice = prices[0];
        int maxprofit=0;

        for(int price:prices){
            if(price<minprice){
                // minprice=Math.min(minprice,prices);
                minprice=price;
            } else{
               int  profit= price-minprice;
               if(profit>maxprofit){
                // maxprofit=Math.max(maxprofit, profit);
                maxprofit=profit;
               }
            }
        }
        return maxprofit;
        
    }
}