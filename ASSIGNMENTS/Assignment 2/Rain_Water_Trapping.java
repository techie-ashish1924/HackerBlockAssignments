import java.util.Scanner;

public class Rain_Water_Trapping {

    public static int Total_Water(int rain[])
    {
        int n = rain.length;
        int Max_left[] = new int[n];
        int Max_right[] = new int[n];
        Max_left[0] = rain[0];
        Max_right[n-1] = rain[n-1];
        int lo = 1;
        int hi = n-2;

        while( lo < n && hi >= 0)
        {
            Max_left[lo] = Math.max(Max_left[lo-1], rain[lo]);
            Max_right[hi] = Math.max(Max_right[hi + 1], rain[hi]);

            lo++;
            hi--;
        }
        int sum = 0;
        for (int i = 0; i < Max_right.length; i++) {
            
            if(Math.min(Max_left[i],Max_right[i])-rain[i] >= 0)
            {
                sum = sum + Math.min(Max_left[i],Max_right[i])-rain[i];
            }
            
        }
        return sum;


    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int test_case = sc.nextInt();

        while(test_case > 0)
        {
            int n = sc.nextInt();
            int arr[] = new int[n];

            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }

            System.out.println(Total_Water(arr));
            test_case--;

        }
    }
    
}
