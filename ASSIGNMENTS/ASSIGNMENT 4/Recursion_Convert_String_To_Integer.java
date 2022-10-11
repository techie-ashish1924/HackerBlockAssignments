import java.util.Scanner;

public class Recursion_Convert_String_To_Integer {

    public static void Calculate(String a, int ans)
    {

        if(a.length() == 0)
        {
            System.out.println(ans);
            // return ans;
        }

        ans = ans * 10 + (int)(a.charAt(a.length()-1));
        // char ch = a.charAt(a.length()-1);
        Calculate(a.substring(0, a.length()-1), ans);
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        Calculate(a, 0);
    }
    
}
