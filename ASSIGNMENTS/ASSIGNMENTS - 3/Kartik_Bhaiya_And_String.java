import java.util.Scanner;

public class Kartik_Bhaiya_And_String {
    public static int Flip(String a, char ch,int k)
    {
        int strt = 0;
        int end = 0;
        int ans = 0;
        int flip = 0;

        while(end < a.length())
        {
            if(a.charAt(end) == ch)
            {
                flip++;
            }

            while(flip > k)
            {
                if(a.charAt(strt) == ch)
                {
                    // strt++;
                    flip--;
                }
                strt++;
            }

            ans = Math.max(ans,end - strt + 1);
            end++;
        }
        return ans;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int f = sc.nextInt();
        String a = sc.next();

        int f1 = Flip(a, 'a', f);
        int f2 = Flip(a, 'b', f);

        System.out.println(Math.max(f1, f2));
    }
    
}
