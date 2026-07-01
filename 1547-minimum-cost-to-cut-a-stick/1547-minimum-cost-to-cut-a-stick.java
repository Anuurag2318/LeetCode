class Solution {
    public static int minCosting(int[] cuts,int i,int j,int [][]dp){
        if(i>j){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int res=Integer.MAX_VALUE;
        for(int k=i;k<=j;k++){
            int cost=cuts[j+1]-cuts[i-1];
            int r=cost+minCosting(cuts,i,k-1,dp)+minCosting(cuts,k+1,j,dp);
            res=Math.min(res,r);
        }
        return dp[i][j]=res;
    }
    public int minCost(int n, int[] cuts) {
        int[] cutNew = new int[cuts.length+2];
        Arrays.fill(cutNew,0);
        for(int i=0;i<cuts.length;i++){
            cutNew[i]=cuts[i];
        }
        cutNew[cuts.length+1]=n;
        Arrays.sort(cutNew);
        int size=cutNew.length;
        int dp[][]=new int[cuts.length+2][cuts.length+2];
        for(int i=0;i<cuts.length+2;i++){
            Arrays.fill(dp[i],-1);
        }
        return minCosting(cutNew,1,size-2,dp);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna