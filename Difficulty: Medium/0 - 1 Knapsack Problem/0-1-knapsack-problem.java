class Solution {
    public int knapProb(int capacity,int val[],int wt[],int n,int i,int[][]dp){
        if(i==n){
            return 0;
        }
        if(dp[i][capacity]!=-1){
            return dp[i][capacity];
        }
        if(wt[i]>capacity){
            return dp[i][capacity]=knapProb(capacity,val,wt,n,i+1,dp);
        }
        int c1=val[i]+knapProb(capacity-wt[i],val,wt,n,i+1,dp);
        int c2=knapProb(capacity,val,wt,n,i+1,dp);
        return dp[i][capacity]=Math.max(c1,c2);
    }
    public int knapsack(int W, int val[], int wt[]) {
        // code here    
        int i=0;
        int n=val.length;
        int dp[][]=new int[n][W+1];
        for(int j=0;j<n;j++){
            Arrays.fill(dp[j],-1);
        }
        return knapProb(W,val,wt,n,i,dp);
    }
}
