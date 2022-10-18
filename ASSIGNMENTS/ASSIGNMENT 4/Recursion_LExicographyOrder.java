import java.util.Scanner;

public class Recursion_LExicographyOrder {

    public static void Lexico(int curr,int n)
    {
        if(curr > n)
        {
            return;
        }
        System.out.println(curr);

        int i=0;

        if(curr == 0)
        {
            i=1;
        }
        for(;i<=9;i++)
        {
            Lexico(curr * 10 + i, n);
        }
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Lexico(0, n);
    }    
    
}
