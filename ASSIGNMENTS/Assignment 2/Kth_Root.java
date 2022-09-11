import java.util.Scanner;

public class Kth_Root {

    public static int Find(long n, long k)
    {
        int ans = 0;
        long li = 1;
        long hi = n;

        while(li <= hi)
        {
            long mid  = li + (hi - li)/2;

            if((long)Math.pow(mid, k) <= n)
            {
                ans = (int)mid;
                li = mid + 1;
            }
            else{
                hi = mid - 1;
            }
        }
        return ans;

    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int test_case = sc.nextInt();

        while(test_case > 0)
        {
            long n = sc.nextLong();
            long k = sc.nextLong();
            System.out.println(Find(n, k));
            test_case--;

        }
        
        

        

    }
    
}
