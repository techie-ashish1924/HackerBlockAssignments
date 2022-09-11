import java.util.Arrays;
import java.util.Scanner;

public class Pair_Of_Roses {

    public static void Pair(int arr[], int target)
    {
        Arrays.sort(arr);
        int lo = 0;
        int hi = arr.length-1;
        int first = 0;
        int last = 0;
        int min = Integer.MAX_VALUE;
        while(lo < hi)
        {
            int val = arr[lo] + arr[hi];
            if(val == target)
            {
                if(Math.abs(arr[lo] - arr[hi]) < min)
                {
                    first = arr[lo];
                    last = arr[hi];
                    min = Math.abs(arr[lo] - arr[hi]);

                }
                lo++;
                hi--;
                
            }
            else if(val > target)
            {
                hi--;
            }
            else if(val < target)
            {
                lo = lo + 1;
            }
        }
        System.out.println("Deepak should buy roses whose prices are " + first + " and " + last + ".");
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the total number of test cases...");
        int test_case = sc.nextInt();
        while(test_case > 0)
        {

            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int target = sc.nextInt();
            Pair(arr, target);
            System.out.println();


            test_case--;
        }
    }
    
}
