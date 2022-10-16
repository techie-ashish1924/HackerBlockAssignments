import java.util.Scanner;

public class ReplaceAll_0_with_5 {

    public static int Replace(int n,int ans,int mul)
    {
        if(n==0)
        {
            return ans;
        }
        // System.out.println(n);
        if(n%10 == 0)
        {
            ans = Replace(n/10,ans + 5*mul,mul*10);
        }
        else{
            ans = Replace(n/10, ans + (n%10)*mul,mul*10);

        }
       
       return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(Replace(n, 0, 1));
        
    }
    
}
