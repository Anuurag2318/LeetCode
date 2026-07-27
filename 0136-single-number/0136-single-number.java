class Solution {
    public int singleNumber(int[] arr) {
        HashMap<Integer,Integer> freq=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            freq.put(arr[i],freq.getOrDefault(arr[i],0)+1);
        }
        for(Integer key: freq.keySet()){
            if(freq.get(key)==1){
                return key;
            }
        }
        return 0;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna