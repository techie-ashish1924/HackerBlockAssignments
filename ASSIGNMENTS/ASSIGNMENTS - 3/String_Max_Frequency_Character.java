import java.util.Scanner;

public class String_Max_Frequency_Character {
    public static char Frequency(String res)
    {
        // String res = k;
        int sum = 1;
        int f_sum = 0;
        char result = (char)0;
        for(int i = 0;i<res.length();i++)
        {
            if(res.charAt(i) != (char)(-1))
            {
                sum = 1;
                for(int j=i+1;j<res.length();j++)
                {
                    if(res.charAt(i) == res.charAt(j))
                    {
                        sum++;
                        res.replace(res.charAt(j), (char)(-1));
                    }
                }

                if(sum > f_sum)
                {
                    f_sum = sum;
                    result = res.charAt(i);
                }
            }

        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        System.out.println(Frequency(a));
    }
    
}
