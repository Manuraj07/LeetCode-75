class Solution {
public:
    vector<int> productExceptSelf(vector<int>& nums) {
        int n = nums.size();
        vector<int>left(n,1);
        vector<int>right(n,1);

        int l_product = 1;
        int r_product = 1;

        for(int i=1;i<n;i++)
        {
            l_product *= nums[i-1];
            left[i] = l_product;
        }
        for(int i = n-2;i>=0;i--)
        {
            r_product *= nums[i+1];
            right[i] = r_product;
        }

        vector<int>ans(n);

        for(int i=0;i<n;i++)
        {
            ans[i] = left[i]*right[i];
        }
        return ans;
        
    }
};
