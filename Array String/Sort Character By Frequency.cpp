class Solution {
public:
    string frequencySort(string s) {
        vector<pair<int, char>> v;
        unordered_map<char, int> m;
        string ans = "";
        for(auto x : s){
            m[x]++;// count frequency of each character
        }
        
        for(auto x : m){
            v.push_back({x.second, x.first});// add in vector frequency and char
        }
        
        sort(v.rbegin(), v.rend());// sort the vec based on frequency
        
        for(auto x : v){
            int cnt = x.first;
            while(cnt--){
                ans += x.second;
            }
        }
        return ans;
    }
};


