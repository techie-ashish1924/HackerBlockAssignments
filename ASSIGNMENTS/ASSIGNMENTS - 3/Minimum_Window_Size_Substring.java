import java.util.Scanner;

public class Minimum_Window_Size_Substring {
    public static String Minimum(String A, String B)
    {
        int strt = 0;
        int end = 0;
        int ans = Integer.MAX_VALUE;
        int count = 0;
        int Freq[] = new int[256];
        String res = "";


        int org[] = new int[256];
        for (int i = 0; i < B.length(); i++) 
        {
            char ch = B.charAt(i);
            org[ch] += 1;   
        }

        while(end < A.length())
        {
            char ch = A.charAt(end);
            if(B.contains(String.valueOf(ch)) && Freq[ch] >= org[ch])
            {
                
                Freq[ch]++;
            }
            else
            {
                count++;
                Freq[ch]++;
            }
            System.out.println("Out side loop : start and end : " + strt + "  " + end);
            while(count >= B.length()  && strt <= end)
            {
                if(count == B.length())
                {
                    if(ans > (end-strt+1))
                    {
                        System.out.println("start and end : " + strt + "  " + end);
                        res = A.substring(strt,end+1);
                    }

                }
    
                char ch2 = A.charAt(strt);
                if((B.contains(String.valueOf(ch2)) && Freq[ch2] > org[ch2]))
                {
                    Freq[ch2]--;
                    // count--;
            
                }
                else
                {
                    count--;
                    Freq[ch2]--;
                    // strt++;
                }
                strt++;
            }
            end++;
        }
        // System.out.println(res);
        return res;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String a = "ADOBECODEBANC";
        String b = "ABC";
        // String a = sc.next();
        // String b = sc.next();
        System.out.println(Minimum(a, b));

        // System.out.println(a);
        // System.out.println(b);
    }
    
}
