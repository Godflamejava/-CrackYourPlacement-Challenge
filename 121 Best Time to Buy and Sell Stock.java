class Solution {
    public int maxProfit(int[] prices) {
          int n = prices.length;  
       int[] differenc= new int[n-1];
            if(n==1)
                    return 0;
            
            for(int i=0;i<n-1;i++)
              differenc[i]=prices[i+1]-prices[i];
         int res=differenc[0];int max=differenc[0];
         for(int i=1;i<differenc.length;i++)
         {
                max=Math.max(differenc[i],differenc[i]+max);
                 res=Math.max(res,max);
         }
            if(res<0)
                 return 0;   
          return res ;          
            
    }
}
