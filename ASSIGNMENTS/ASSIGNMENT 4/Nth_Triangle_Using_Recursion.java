import java.util.Scanner;

public class Nth_Triangle_Using_Recursion {

    public static int Nth_Triangle(int n)
    {
        if(n==1)
        {
            return 1;
        }
        return Nth_Triangle(n-1) + n;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(Nth_Triangle(n));

    }
    
}
