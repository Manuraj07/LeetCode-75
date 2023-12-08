class Solution
{
    public static boolean isPrime(int n){
        if(n<2)return false;
        if(n == 2 || n==3)return true;
        if(n%2 == 0 || n%3 == 0)return false;
        for(int i = 5;i*i<n;i+=6)
        {
            if(n%i == 0 || n%(i+2) == 0)return false;
        }
        return true;
        
    }
    
    public static int nextPrime(int n)
    {
        if(n<=1)return 2;
        int prime = n;
        boolean flag = false;
        while(!flag){
            prime++;
            if(isPrime(prime)){
                flag = true;
            }
        }
        return prime;
    }
    public int minNumber(int arr[], int N)
    {
        int sum = 0;
        for(int i=0;i<N;i++)sum+=arr[i];
        return isPrime(sum)?0:nextPrime(sum) - sum;
    }
}
