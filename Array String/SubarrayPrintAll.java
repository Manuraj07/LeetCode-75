import java.util.Scanner;

public class SubArrayAll {
    public static void printAll(int arr[],int n){
        for(int size=1;size<=n;size++)
        {
            for(int i=0;i<=n-size;i++){
                for(int j=i;j<=i+size-1;j++)
                {
                    System.out.print(arr[i]+" ");
                }
                System.out.println();
            }
        }
    }
    public static void printAll_1(int []arr,int n)
    {
        for(int i=0;i<n;i++){
            for(int j=i ;j<n;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr  = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
//        printAll(arr,n);
        printAll_1(arr,n);
    }
}
