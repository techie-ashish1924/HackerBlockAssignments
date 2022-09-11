import java.util.Scanner;

public class Print_ArmStrong_Number {
    public static int length(int n)
    {
        int sum = 0;
        while(n>0)
        {
            sum++;
            n /= 10;
        }
        return sum;
    }
    public static void ArmStrong(int n1,int n2)
    {
        for(int i=n1;i<=n2;i++)
        {
            int val = i;
            int len = length(i);
            // System.out.println(len);
            int sum = 0;
            while(val>0)
            {
                int rem = val % 10;
                // System.out.println("rem..." + rem);
                sum = sum + (int)(Math.pow(rem, len));
                // System.out.println("Sum......" + sum);
                val = val/10;
            }
            if(sum == i)
            {
                System.out.println(sum);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        ArmStrong(n1, n2);
    }
    
}
