import java.util.Scanner;

public class Von_Neuman_Loves_Binary {

    public static int Decimal(int n)
    {
        int sum = 0;
        int mul = 1;
        while(n>0)
        {
            int rem = n%2;
            sum = sum + rem * mul;
            mul *= 2;
            n=n/10;
        }
        return sum;
    }


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();

        while(test-->0)
        {
            int a = sc.nextInt();
            System.out.println(Decimal(a));
        }
    }
    
}
