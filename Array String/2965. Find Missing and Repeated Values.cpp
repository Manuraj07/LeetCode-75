class Solution {
public:
    vector<int> findMissingAndRepeatedValues(vector<vector<int>>& grid) {
        
        int n = grid.size();
        unordered_map<int, int> mpp;
        
        for(auto it : grid){
            for(auto i : it){
                mpp[i]++;
            }
        }

        int a, b;
        for(int i = 1; i <= n*n; i++){
            if(mpp[i] == 2) a = i;
            if(mpp[i] == 0) b = i;
        }

        return {a, b};
    }
};
