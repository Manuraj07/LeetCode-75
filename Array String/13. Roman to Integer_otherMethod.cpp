class Solution {
public:
    int romanToInt(string s) {
        int res=0, x = 0;
        for (int i = s.size()-1; ~i; i--) {
            switch(s[i]) {
                case 'I': x = 1; break;
                case 'V': x = 5; break;
                case 'X': x = 10; break;
                case 'L': x = 50; break;
                case 'C': x = 100; break;
                case 'D': x = 500; break;
                case 'M': x = 1000; break;
            }
            if (4 * x < res) res -= x;
            else res += x;
        }
        return res;        
    }

};
