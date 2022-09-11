import java.util.Scanner;

public class Murthal_Parantha {

    public static boolean IsItPOSSIBLE(int arr[],int time,int no_parantha)
    {
        int total_parantha = 0;
        for (int i = 0; i < arr.length; i++) {
            int l_time = 1;
            int ind =1;
            int l_p = 0;
            while(time >= l_time)
            {
                // l_p++;
                total_parantha++;
                l_time = l_time + ++ind * arr[i];
            }
            System.out.println("for " + arr[i] + " parathe : " + total_parantha + " for " + time);
            if(total_parantha >= no_parantha)
            {
                return true;
            }
        }
        return false;
    }
    public static int Time(int arr[],int no_parantha)
    {
        int sum = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(min > arr[i])
            {
                min = arr[i];
            }
        }

        // System.out.println("Minimum value" + min);
        for (int i = 1; i <= no_parantha; i++) {
            sum = sum + i*min;
        }
        // System.out.println("SUm is " + sum);
        int lo = 0;
        int hi = sum;
        int ans = 0;

        while(lo <= hi)
        {
            int mid  = (lo + hi)/2;

            if(IsItPOSSIBLE(arr,mid,no_parantha))
            {
                ans = mid;
                lo = mid +1 ;
            }
            else{
                hi = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int no_parantha = sc.nextInt();
        int cook = sc.nextInt();
        int arr[] = new int[cook];
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            max = Math.max(max,arr[i]);
        }
        // Time(arr, no_parantha);
        System.out.println(Time(arr, no_parantha));




    }
    
}
