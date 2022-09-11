import java.lang.annotation.Target;
import java.util.Arrays;
import java.util.Scanner;

public class Array_Target_SumPair {

    public static void Sum(int arr[], int trget)
    {
        int lo = 0;
        int hi = arr.length-1;
        Arrays.sort(arr);

        while(lo < hi)
        {
            if(arr[lo] + arr[hi] == trget)
            {
                System.out.println(arr[lo] + " and " + arr[hi]);
                lo++;
                hi--;
            }
            else if(arr[lo] + arr[hi] < trget)
            {
                lo = lo + 1;
            }
            else if(arr[lo] + arr[hi] > trget)
            {
                hi = hi - 1;
            }
        }
        
        
        
        
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        Sum(arr, target);

    }
    
}
