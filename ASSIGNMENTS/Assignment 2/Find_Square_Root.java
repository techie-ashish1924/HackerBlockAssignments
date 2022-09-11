import java.util.Scanner;

public class Find_Square_Root {

    public static int Square_Root(long a)
    {
        long lo = 1;
        long hi = a;
        int ans = 0;
        while(lo <= hi)
        {
            long mid = lo + (hi - lo)/2;
            if(mid * mid <= a)
            {
                ans = (int) mid;
                lo = mid + 1;
            }
            else{
                hi = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println(Square_Root(n));

    }
    
}
