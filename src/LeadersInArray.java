import java.util.Scanner;

public class LeadersInArray {
    static void leader(int arr[],int n)
    {
        int result[]=new int[n];
        for(int i=0;i<n;i++)
        {
            int j;
            for(j=i+1;j<n;j++)
            {
                if(arr[i]<=arr[j])
                {
                    break;
                }
            }
            if(j==n)
            {
                result[i]=arr[i];
                System.out.println(result[i]);
            }
        }

    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=scanner.nextInt();
        }
        leader(arr,n);

    }
}