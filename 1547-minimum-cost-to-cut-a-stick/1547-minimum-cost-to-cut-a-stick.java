class Solution {
    public int minCost(int n, int[] cuts) {
       int[] cutNew = new int[cuts.length+2];
        Arrays.fill(cutNew,0);
        for(int i=0;i<cuts.length;i++){
            cutNew[i]=cuts[i];
        }
        cutNew[cuts.length+1]=n;
        Arrays.sort(cutNew);
        int size = cutNew.length;
        int [][]dp=new int[size][size];
        for(int i=size-2;i>=1;i--){
            for(int j=i;j<=size-2;j++){
                int res=Integer.MAX_VALUE;
                for(int k=i;k<=j;k++){
                    int cost=cutNew[j+1]-cutNew[i-1];
                    int curr=cost+dp[i][k-1]+dp[k+1][j];
                    res=Math.min(res,curr);
                }
                dp[i][j]=res;
            }
        }
        return dp[1][size-2];
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna