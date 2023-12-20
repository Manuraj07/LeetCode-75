class Solution {
    public boolean isPalindrome(int n) {
        int temp = n;
        int ans = 0;
        if(n<0)return false;
        while (n!=0)
        {
            int res = n%10;
            ans = ans*10+res;
            n/=10;
        }
        return temp == ans;

    }
}
