import java.util.Scanner;

import javax.sound.midi.SysexMessage;

public class Decimal_To_Octal {

    public static int Octal(int n)
    {
        int sum = 0;
        int i = 0;
        while(n>0)
        {
            int rem = n%8;
            sum = sum + (int)(rem * Math.pow(10,i++));
            // System.out.println(sum);
          
            n = n/8;
        }
        return sum;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Octal(n));
    }
    
}
