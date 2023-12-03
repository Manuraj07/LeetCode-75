import java.util.Scanner;

public class LongestConsecutiveArray {
    public static void Longest1(int[] arr )
    {
        int si=0,ei=0,start=0,end=0;
        int n=arr.length;
        for(int i=0;i<n-1;i++)
        {
            if(arr[i]+1==arr[i+1])
            {
                ei++;
            }
            else {
                if(ei-si>end-start)
                {
                    end=ei;
                    start=si;
                }
                si=i+1;
                ei=i+1;
            }
        }
        if(ei-si>end-start)
        {
            end=ei;
            start=si;
        }

        for(int i=start;i<=end;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

    public static int Longe(int [] arr)
    {
        int count=1;
        int ans=0;
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]+1==arr[i+1])
            {
                count++;
            }
            else
            {
                if(count>ans)
                {
                    ans=count;
                }
                count=1;
            }
        }
        if(count>ans)
        {
            ans=count;
        }

        return ans;
    }
    public static int Longest(int []arr){
        int n = arr.length;
        int diff = Math.abs(arr[1]-arr[0]);
        int cnt = 1;
        int maxi = 0;
        int i = 0;
        int j = i+1;
        while (i<n && j<n){

            if(arr[j] - arr[i] == diff)
            {
                cnt++;
                i++;
                j++;
            }
            else {
                maxi = Math.max(cnt,maxi);
                diff = arr[j] - arr[i];
                i++;
                j++;
                cnt = 1;

            }


        }
        return maxi;

    }

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int []arr = {2,3,4,5,7,8,9,10,11,23,24,25,26,27,28,29};
        //int ans = Longest(arr);
   //     System.out.println(ans);
//        Longest1(arr);

        int ans=Longe(arr);
        System.out.println(ans);
    }
}
