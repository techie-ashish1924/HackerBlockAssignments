import java.util.Scanner;

public class Recursion_Subsequence {

    public static int Subsequence(String s,String ans)
    {
        if(s.length() == 0)
        {
            System.out.println(ans);
            return 1;
        }
        char ch = s.charAt(0);
        int ans1 = Subsequence(s.substring(1), ans);
        int ans2 = Subsequence(s.substring(1), ans+ch);

        return ans1+ans2;

    }


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        System.out.println(Subsequence(a, ""));
    }
    
}
