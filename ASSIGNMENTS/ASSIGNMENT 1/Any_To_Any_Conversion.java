import java.util.Scanner;

public class Any_To_Any_Conversion {

    public static int Decimal(int n,int sb)
    {
        int sum = 0;
        int mul = 0;
        while(n>0)
        {
            int rem = n%10;
            // System.out.println("remainder............. "+ rem);
            sum = sum + (int)(rem * Math.pow(sb, mul++));
            // System.out.println("Sum is. ......  " + sum);
            // mul *= 10;
            n = n/10;
            // System.out.println("n value ..........." + n);
            // System.out.println("------------------------------------------------------");

        }
        // System.out.println("deciml value : " + sum);
        return sum;
    }

    public static void Conversion(int sb,int db, int sn)
    {
        int mul = 1;
        int sum = 0;
        int dec_value = Decimal(sn, sb);
        // System.out.println("dec_value ....... " + dec_value);
        while(dec_value>0)
        {
            int rem = dec_value % db;
            // System.out.println("rem............" + rem);
            sum = sum + rem  * mul;
            // System.out.println("sum............" + sum);
            dec_value = dec_value / db;
            // System.out.println("after one operation dec_val is .........." + dec_value);
            mul = mul * 10;
            // System.out.println("----------------------------------------");
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your source base : ");
        int sb = sc.nextInt();
        System.out.println("Enter your destination base : ");
        int db = sc.nextInt();
        System.out.println("Enter your number : ");
        int sn = sc.nextInt();
        Conversion(sb, db, sn);
        

    }
    
}
