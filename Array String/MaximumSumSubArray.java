import java.util.Scanner;

public class MaximumSubArray {


    // Nive Approach...
    public static int findMaximumSumSubArray(int []arr,int k,int n)
    {
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i <= n - k; i++) {
            int cSum = 0;
            for (int j = i; j < i + k; j++) {
                cSum += arr[j];
            }
            maxSum = Math.max(maxSum, cSum);
        }
        return maxSum;

    }

    // Optimise Code...

    public static int MaxSubArrayCal(int []arr,int k,int n)
    {
        int wSum = 0;
        int mSum = Integer.MIN_VALUE;
        for(int i=0;i<k;i++){
            wSum+=arr[i];
        }

        for(int i=k;i<n;i++){
            wSum = wSum - arr[i-k]+arr[i];
            mSum = Math.max(mSum,wSum);
        }
        return mSum;
    }







    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        int n = ss.nextInt();
        int k = ss.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = ss.nextInt();
        }
       int res =  findMaximumSumSubArray(arr,k,n);
        System.out.println(res);

        int res1 = MaxSubArrayCal(arr,k,n);
        System.out.println(res1);
    }
}
