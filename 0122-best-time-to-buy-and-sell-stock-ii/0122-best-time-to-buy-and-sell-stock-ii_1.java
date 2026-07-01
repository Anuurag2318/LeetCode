class Solution{
public static int maxProf(int[]prices,int i,int n,int transaction,int [][]dp){
        if(i==n){
            return 0;
        }
        if(dp[i][transaction]!=-1){
            return dp[i][transaction];
        }
        if(transaction==2){
            int c1=maxProf(prices,i+1,n,transaction-1,dp)-prices[i];
            int c2=maxProf(prices,i+1,n,transaction,dp);
            return dp[i][transaction]=Math.max(c1,c2);
        }
        else{
            int c1=maxProf(prices,i+1,n,2,dp)+prices[i];
            int c2=maxProf(prices,i+1,n,transaction,dp);
            return dp[i][transaction]=Math.max(c1,c2);
        }
    }
public static int maxProfit(int[] prices) {
        int n=prices.length;
        int transaction=2;
        int dp[][]=new int[n+1][transaction+1];
        for(int i=0;i<=n;i++){
            Arrays.fill(dp[i],-1);
        }
        int i=0;
        return maxProf(prices,i,n,transaction,dp);
}
}
