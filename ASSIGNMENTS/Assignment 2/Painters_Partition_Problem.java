import java.util.Scanner;
import java.util.spi.ToolProvider;

public class Painters_Partition_Problem {

    public static boolean ISiTPossible(int arr[],int mid , int n_painter)
    {
        int total = 0;
        int i = 0;
        int height = 0;

        while(i<arr.length)
        {
            if(height + arr[i] <= mid)
            {
                height = height + arr[i];
                // total++;
                // height = 0;
                i++;
            }
            else{
               height = 0;
               total++;
            }

            if(total > n_painter)
            {
                return false;
            }
            // i++;
        }
        return true;
    }
    public static int Paint(int arr[],int n_painter)
    {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) 
        {
           sum += arr[i];
            
        }
        int lo = 0;
        int hi = sum;
        int ans = 0;
        while(lo < hi)
        {
            int mid = (hi + lo)/2;
            if(ISiTPossible(arr,mid,n_painter))
            {
                ans = mid;
                // System.out.println("Medium valid : " + mid);
                hi = mid - 1;
            }
            else{
                lo = mid + 1;
            }
        }
        return ans;
        
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(Paint(arr,k));

    }
    
    
}
