class Solution {
public:
    int romanToInt(string s) {
        

        int ans = 0;
        unordered_map<int,int>mpp{

            {'I',1},{'V',5},{'X',10},{'L',50},{'C',100},{'D',500},{'M',1000}
        };

        for(int i=0;i<s.size();i++)
        {
            if(mpp[s[i]] < mpp[s[i+1]]){
                ans -= mpp[s[i]];
            }
            else
            {
                ans +=mpp[s[i]];
            }
        }
        return ans;




    }
};
