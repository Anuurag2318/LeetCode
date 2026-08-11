class Solution {
    public double fractionalKnapsack(int[] val, int[] wt, int capacity) {
        // code here
         int n = val.length;
        double[][] items = new double[n][3];
        for (int i = 0; i < n; i++) {
            items[i][0] = val[i];
            items[i][1] = wt[i];
            items[i][2] = (double) val[i] / wt[i];
        }
        Arrays.sort(items, (a, b) -> Double.compare(b[2], a[2]));
        double total = 0;
        for (int i = 0; i < n; i++) {
            if (capacity >= items[i][1]) {
                total += items[i][0];
                capacity -= items[i][1];
            } else {
                total += items[i][2] * capacity;
                break;
            }
        }
        return total;
    }
}