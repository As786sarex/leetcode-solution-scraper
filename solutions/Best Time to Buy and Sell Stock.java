class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length==1)
            return 0;
            
        int min=Integer.MAX_VALUE,result=0;
        for(int i=0;i<prices.length;++i){
            result=Integer.max(prices[i]-min,result);
            min=Integer.min(prices[i],min);
        }
        return result;
    }
}
