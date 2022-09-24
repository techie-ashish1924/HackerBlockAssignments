import java.util.Scanner;

public class String_Count_Palindrome_Substring {

    public static boolean Palindrome(String k)
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

    public static int Count_Palindrome(String a)
    {
        int sum =0;
        for(int len = 1; len <= a.length();len++)
        {
            for(int j=len;j<=a.length();j++)
            {
                int i = j - len;
                // System.out.println(a.substring(i,j));
                if(Palindrome(a.substring(i,j)))
                {
                    // System.out.println(a.substring(i,j));
                    sum++;
                    // System.out.println(sum);
                }
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        System.out.println(Count_Palindrome(a));
    }
    
}
