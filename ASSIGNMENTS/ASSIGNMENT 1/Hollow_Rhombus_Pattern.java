import java.util.Scanner;

public class Hollow_Rhombus_Pattern {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int space = n-1;
        int sp_inside = n-2;

        while(row <= n)
        {
            int s1 = 1;
            while(s1 <= space)
            {
                System.out.print(" ");
                s1++;
            }
            if(row == 1 || row == n)
            {
                int st1 = 1;
                while(st1 <= n)
                {
                    System.out.print("*");
                    st1++;
                }
            }
            else{
                System.out.print("*");
                 int s_in1 = 1;
                while(s_in1 <= sp_inside)
                {
                    System.out.print(" ");
                    s_in1++;
                }
                System.out.print("*");
            }
            row++;
            space--;
            System.out.println();
        }
    }
    
}
