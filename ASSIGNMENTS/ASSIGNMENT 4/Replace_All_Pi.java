import java.util.Scanner;

public class Replace_All_Pi {

    public static String Replace_Pi(String ans)
    {
        if(ans.contains("pi"))
        {
            String a = ans.replaceFirst("pi", "3.14");
            ans = Replace_Pi(a);
        }
        
            return ans;
    
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while(n-->0)
        {
            String a = sc.next();
            System.out.println(Replace_Pi(a));

        }
        
    }
    
}
