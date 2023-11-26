import java.util.Scanner;

public class InverseOfArray {

    public static int[] Inverse(int []arr, int n)
    {
        int []ans = new int[n];
        for(int i=0;i<n;i++){
            ans[arr[i]] = i;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr  = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int []res = Inverse(arr,n);
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
    }
}
