import java.util.Scanner;

public class Hollow_Rhombus_Pattern {


    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int row = 1;
        int spce = n-1;
        int inside_space = n-2;

        while(row<=n)
        {
            int s = 0;
            while(s<spce)
            {
                System.out.print(" ");
                s++;
            }
            if(row == 1 || row == n)
            {
                int st = 0;
                while(st<n)
                {
                    System.out.print("*");
                    st++;
                }
            }
            else{
                System.out.print("*");
                int in_sp = 0;
                while(in_sp < inside_space)
                {
                    System.out.print(" ");
                    in_sp++;
                }
                System.out.print("*");
            }
            System.out.println();
            row++;
            spce--;
        }
    }
    
}
