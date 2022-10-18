import java.util.Scanner;

public class Recursion_Convert_String_To_Integer {

    public static void Calculate(String a, int ans,int mul,int ind)
    {

        if(ind < 0)
        {
            System.out.println(ans);
            return;
        }
        char z = a.charAt(ind);
        int z1 = z - '0';
        ans = ans + z1 * mul;

        Calculate(a, ans, mul*10, ind-1);
        // Calculate(a, (int)(a.charAt(a.length()-1))*mul,mul*10,ind-1);

    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        Calculate(a, 0,1,a.length()-1);
    }
    
}
