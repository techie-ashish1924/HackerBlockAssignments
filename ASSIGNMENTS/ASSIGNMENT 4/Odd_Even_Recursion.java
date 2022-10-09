import java.util.Scanner;

public class Odd_Even_Recursion {
    public static void Odd_Even(int n)
    {
        if(n==0)
        {
            
        }
        if(n%2!=0)
        {
            System.out.println(n);
            // Odd_Even(n-1);
        }
        Odd_Even(n-1);
    
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Odd_Even(n);
    
    }
    
}
