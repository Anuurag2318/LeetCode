class Solution {
    public int[] sortedSquares(int[] nums) {
        int size=nums.length;
        int idx=size-1;
        int []result=new int[size];
        int left=0;
        int right=size-1;
        while(left<=right){
            int low=nums[left]*nums[left];
            int high=nums[right]*nums[right];
            if(low>high){
                result[idx--]=low;
                left++;
            }
            else{
                result[idx--]=high;
                right--;
            }
        }
        return result;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna