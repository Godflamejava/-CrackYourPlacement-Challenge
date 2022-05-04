class Solution {
    public int maxProfit(int[] prices) {
        int k=prices.length;
            for(int i=0;i<k-1;i++){
                  prices[i]=prices[i+1]-prices[i]; 
            }
            int max=0;
            for(int i=0;i<k-1;i++)
            {
               max=Math.max(max,max+prices[i]); 
            }
            return max;
    }
}
