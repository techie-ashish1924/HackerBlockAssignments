import java.util.Scanner;

public class Recursion_Twins {
    public static int Twins(String a,int ind,int ans)
    {
        if(ind > a.length() - 3)
        {
            return ans;
        }

        if( (a.charAt(ind) == a.charAt(ind+2)) && (a.charAt(ind) != a.charAt(ind+1)))
        {
            ans++;
        }

        ans = Twins(a, ind+1, ans);
        return ans;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        System.out.println(Twins(a, 0, 0));
    }
    
}
