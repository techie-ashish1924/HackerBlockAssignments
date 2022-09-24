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
                    flip--;
                }
                strt++;
            }

            ans = Math.max(ans, end - strt + 1);
            end++;

        }
        return ans;

    }

    public static int Solution(String a , int k)
    {

        int flipa = Flip(a,'a',k);
        int flipb = Flip(a, 'b',k);
        
        return Math.max(flipa, flipb);
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();

        String a = sc.next();
        System.out.println(Solution(a , k));
    }
    
}
