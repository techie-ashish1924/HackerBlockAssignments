import java.util.Scanner;

public class String_Remove_Duplicates_Consecutive {


    public static void DeleteDuplicate(String s)
    {
        char a = s.charAt(0);
        int i = 1;
        String res = "" + a;
        while(i<s.length()) 
        {
            if(a != s.charAt(i))
            {
                res = res + s.charAt(i);
                a = s.charAt(i);
                
            }
            i++;
        }
        System.out.println(res);
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        DeleteDuplicate(a);


    }
    
}
