class Solution {
    public static int climbing(int n,int i,int[]dp){
        if(i==n){
            return 1;
        }
        if(i>n){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        int c1=climbing(n,i+1,dp);
        int c2=climbing(n,i+2,dp);
        return dp[i]=c1+c2;
    }
    public int climbStairs(int n) {
        int i=0;
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        return climbing(n,i,dp);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna