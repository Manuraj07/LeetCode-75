class Solution {
public:
    int trap(vector<int>& height) {
        int n = height.size();
        if (n <= 2) {
            return 0;
        }

        vector<int> leftMax(n, 0);
        vector<int> rightMax(n, 0);

        // Calculate leftMax for each position
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = max(leftMax[i - 1], height[i]);
        }

        // Calculate rightMax for each position
        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = max(rightMax[i + 1], height[i]);
        }

        // Calculate trapped water based on leftMax and rightMax
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans += max(0, min(leftMax[i], rightMax[i]) - height[i]);
        }

        return ans;
    }
};
