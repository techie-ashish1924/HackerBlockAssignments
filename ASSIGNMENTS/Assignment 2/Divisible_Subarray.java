import java.util.Scanner;

public class Divisible_Subarray {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test > 0)
        {

            int n = sc.nextInt();
            int arr[] = new int[n];
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
                sum = sum + arr[i];
            }
            int f_sum = 0;
            if(sum%n == 0)
            {
                f_sum = 1;
            for (int j = 0; j < arr.length; j++) {
                if((sum - arr[j]) % n == 0)
                {
                    f_sum = f_sum + (n-j+1);
                }
            }
            System.out.println(f_sum);
            test--;
        }
    }
    }
    
}
