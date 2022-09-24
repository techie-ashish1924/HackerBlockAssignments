import java.util.Scanner;

public class String_Toggle_Case {

    public static void Toggle(String k)
    {
        String ans = "";
        for(int i=0;i<k.length();i++)
        {
            
            if(k.charAt(i) >= 'a' && k.charAt(i) <= 'z')
            {
                ans = ans +  (char)(k.charAt(i)-32);
                // System.out.println(ans);
            }
            else if(k.charAt(i) >= 'A' && k.charAt(i) <= 'Z')
            {
                ans = ans + (char)(k.charAt(i)+32);
            }
            else{
                ans = ans + (char)(k.charAt(i));
            }
        }
        System.out.println(ans);
        // return ans;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String a = sc.next();

         Toggle(a);
    }
    
}
