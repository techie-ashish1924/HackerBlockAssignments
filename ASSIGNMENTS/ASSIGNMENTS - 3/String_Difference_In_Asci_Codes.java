import java.util.Scanner;

public class String_Difference_In_Asci_Codes {

    public static String Difference(String k)
    {
        String ans = "" + k.charAt(0);

        for(int i=1;i<k.length();i++)
        {
            ans = ans + String.valueOf(k.charAt(i) - k.charAt(i-1)) + k.charAt(i) ;
        }

        // ans = ans + k.charAt(k.length()-1);

        return ans;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        System.out.println(Difference(a));
    }
    
}
