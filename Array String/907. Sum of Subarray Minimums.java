class Solution {
    public int sumSubarrayMins(int[] arr) {
        int MOD = 1000000007;
        int n = arr.length;
        int ans = 0;

        for (int start = 0; start < n; start++) {
            for (int end = start; end < n; end++) {
                int minVal = arr[start];

                for (int i = start; i <= end; i++) {
                    minVal = Math.min(minVal, arr[i]);
                }

                ans = (ans + minVal) % MOD;
            }
        }

        return ans;
    }
}
