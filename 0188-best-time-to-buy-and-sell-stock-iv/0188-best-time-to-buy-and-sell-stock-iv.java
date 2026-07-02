class Solution {
    public int maxProfit(int k, int[] prices) {
        int n=prices.length;
        if(n==0){
            return 0;
        }
        k=k*2;
//        for i==n
        int [][]dp=new int[n+1][k+1];
        for(int j=0;j<=k;j++){
            dp[n][j]=0;
        }
//        For Transaction==0
        for(int i=0;i<=n;i++){
            dp[i][0]=0;
        }
        for(int i=n-1;i>=0;i--){
            for(int j=1;j<=k;j++){
                if(j%2==0){
                    dp[i][j]=Math.max(dp[i+1][j-1]-prices[i],dp[i+1][j]);
                }
                else{
                    dp[i][j]=Math.max(dp[i+1][j-1]+prices[i],dp[i+1][j]);
                }
            }
        }
        return dp[0][k];
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna