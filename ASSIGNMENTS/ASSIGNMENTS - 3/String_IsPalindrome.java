import java.util.Scanner;

public class String_IsPalindrome {

    public static boolean Is(String k)
    {
        int strt = 0;
        int end = k.length()-1;

        while(strt <= end)
        {
            if(k.charAt(strt) != k.charAt(end))
            {
                return false;
            }
            strt++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        System.out.println(Is(a));
    }
    
}
