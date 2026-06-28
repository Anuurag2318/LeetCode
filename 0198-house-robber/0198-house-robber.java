class Solution {
    public int robbing(int[] arr,int i,int free,int n,int [][]dp){
        if(i==n){
            return 0;
        }
        if(free==0){
            return dp[i][free]=robbing(arr,i+1,1,n,dp);
        }
        if(dp[i][free]!=-1){
            return dp[i][free];
        }
        int c1=arr[i]+robbing(arr,i+1,0,n,dp);
        int c2=robbing(arr,i+1,1,n,dp);
        return dp[i][free]=Math.max(c1,c2);
    }
    public int rob(int[] arr) {
        
        int free=1;
        int n=arr.length;
        int dp[][]=new int[n][2];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }
        int i=0;
        return robbing(arr,i,free,n,dp);
    }
}
