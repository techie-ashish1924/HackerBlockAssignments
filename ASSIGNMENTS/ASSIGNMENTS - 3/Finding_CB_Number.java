import java.util.Scanner;

public class Finding_CB_Number {

    public static boolean CB_Number(String a)
    {
        int val = Integer.parseInt(a);
        if(val == 0 || val == 1)
        {
            System.out.println("0 or 1");
            return false;
        }
        else if(val==2 || val == 3 || val == 5 || val == 7 || val == 11 || val == 13 || val == 17 || val == 19 || val == 23 || val == 29)
        {
            System.out.println("double equals to condition");
            return true;
        }
        else if(val%2 != 0 && val%3 != 0 && val%5 != 0 && val%7 != 0 && val%11 != 0 && val%13 != 0 && val%17 != 0 && val%19 != 0 && val%23 != 0 && val%29 != 0)
        {
            System.out.println("val not modulo");
            return true;
        }
        else{
            System.out.println("Else condition");
            return false;
        }

    }

    public static int Count(String k)
    {
        int sum = 0;
        for(int i=0;i<k.length();i++)
        {
            String res = "";
            for(int j = i ;j<k.length();j++)
            {
                res = res + k.charAt(j);
                // String z = "" + k.charAt(j);
                System.out.println(res);
                if(res.length() != k.length())
                {

                
                if(CB_Number(res))
                {
                    sum++;
                    System.out.println("--------------------------------------");
                    System.out.println(sum);
                    System.out.println("------------------------------------------");
                }
            }
                // else{
                    // break;
                // }
            }
        }
        // for(int len = 1;len <= k.length();len++)
        // {
            // for(int j=len; j<= k.length();j++)
            // {
                // int i = j - len;

                // if(CB_Number(k.substring(i, j)))
                // {
                    // System.out.println(k.substring(i, j));
                    // sum++;
                    // System.out.println(sum);
                    // break;
                // }
            // }
            // 
        // }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str1 = sc.next();
        System.out.println(Count(str1));
    }
    
}
