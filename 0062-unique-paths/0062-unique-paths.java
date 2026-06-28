class Solution {
    public static int unique(int i,int j,int m,int n,int dp[][]){
        if(i==m-1 && j==n-1){
            return 1;
        }
        if(i>=m || i<0 || j<0||  j>=n){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int c1=unique(i+1,j,m,n,dp);
        int c2=unique(i,j+1,m,n,dp);
        return dp[i][j]=c1+c2;
    }
    public int uniquePaths(int m, int n) {
        int dp[][]=new int[m+1][n+1];
        for(int i=0;i<=m;i++){
            Arrays.fill(dp[i],-1);
        }
        int i=0;
        int j=0;
        return unique(i,j,m,n,dp);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna