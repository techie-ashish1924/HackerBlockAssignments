import java.util.Scanner;

public class Generate_Binary_Strings {

    public static void Print(String a,int ind,String ans)
    {
        if(ind == a.length())
        {
            System.out.println(ans);
            return;
        }
        if(a.charAt(ind) == '?')
        {
            Print(a, ind+1, ans + '0');
            Print(a, ind+1, ans + '1');
        }
        else{
            Print(a, ind+1, ans + a.charAt(ind));
        }

    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while(n-->0)
        {
        String a = sc.next();

        Print(a, 0, "");
    
        }
    }
    
}
