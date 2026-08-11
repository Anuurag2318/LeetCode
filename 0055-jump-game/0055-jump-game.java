class Solution {
    public boolean canJump(int[] nums) {
        int reach=0;
        for(int i=0;i<nums.length;i++){
            if(reach<i){
                return false;
            }
            reach=Math.max(reach,i+nums[i]);
            if(reach>=nums.length-1){
                return true;
            }
        }
        return true;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna