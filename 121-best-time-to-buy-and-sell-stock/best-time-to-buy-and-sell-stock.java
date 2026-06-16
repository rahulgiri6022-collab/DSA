class Solution {
    public int maxProfit(int[] prices) {
        int buy=prices[0];
        int  profit=0;
        for(int i=1;i<prices.length;i++){
            int cost=prices[i]-buy;
           if(cost>profit){
            profit=cost;
           }
           if(prices[i]<buy){
            buy=prices[i];
           }
        }
        return profit;
       
     
       
      
        
    }
}