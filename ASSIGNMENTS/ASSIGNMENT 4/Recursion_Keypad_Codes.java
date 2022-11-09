
import java.util.*;
public class Recursion_Keypad_Codes {
    public static String[] codes = {"abc","def","ghi","jkl","mno","pqrs","tuv","wx","yz"};
    public static int Display(String str2,String ans,int count)
    {
        if(str2.length()==0)
        {
            System.out.print(ans+" ");
            return count+1;
        }
        char ch = str2.charAt(0);
        String r = str2.substring(1);
        String code = codes[ch-'1'];
        for(int i=0;i<code.length();i++)
        {
            count = Display(r,ans+code.charAt(i),count);
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt();
        String str2 = Integer.toString(a1);
        System.out.println("\n"+Display(str2,"",0));

    }
}