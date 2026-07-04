class Solution {
    public int[] twoSum(int[] arr, int target) {
        int n=arr.length;
        int i=0;
        int j=n-1;
        int sum=0;
        while(i<j){
            sum=arr[i]+arr[j];
            if(sum==target){
                return new int[]{i+1,j+1};
            }
            else if(sum<target){
                i=i+1;
            }
            else{
                j=j-1;
            }
        }
        return new int[]{};
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna