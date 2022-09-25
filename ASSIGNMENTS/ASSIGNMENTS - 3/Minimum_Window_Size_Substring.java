import java.util.Scanner;

public class Minimum_Window_Size_Substring {
    public static int Minimum(String A, String B)
    {
        int strt = 0;
        int end = 0;
        int ans = Integer.MAX_VALUE;
        int count = 0;
        int Freq[] = new int[256];
        for(int i=0;i<B.length();i++)
        {
            Freq[B.charAt(i)]++;
        }
        String result = "";

        while(end < A.length())
        {
            char ch = A.charAt(end);
            if(B.contains(String.valueOf(ch)) && Freq[ch] >= 1)
            {
                System.out.println("B Contains " + A.charAt(end));
                // count++;
                Freq[ch]++;
            }
            // Freq[ch]++;

            while(count > B.length()  && strt <= end)
            {
                char ch2 = A.charAt(strt);
                if(B.contains(String.valueOf(ch2)) && Freq[ch2] > 1)
                {
                    count--;
                }
                Freq[ch2]--;
                strt++;
            }
            if(count == B.length())
            {
                System.out.println("end - strt + 1");
                ans = Math.min(ans, end - strt + 1);
                // if (ans < end-strt+1)
                // {
                    // result = String.valueOf(A.substring(strt, end+1));
                    // System.out.println(result);
                    // ans = end-strt+1;
                // }
            }
            end++;
        }
        return ans;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        // String a = sc.next();
        // String b = sc.next();
        String a ="ADOBECODEBANC";
        String b = "ABC";
        System.out.println(Minimum(a, b));

        // System.out.println(a);
        // System.out.println(b);
    }
    
}
