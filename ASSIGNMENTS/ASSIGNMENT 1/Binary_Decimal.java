import java.util.Scanner;

import javax.swing.plaf.multi.MultiLookAndFeel;

public class Binary_Decimal {

    public static int Decimal(int n)
    {
        int sum=0;
        int i=0;
        while(n>0)
        {
            int rem = n%2;
            sum = sum + (int)(rem * Math.pow(2, i++));
            n=n/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Decimal(n));
        
    }
    
}
