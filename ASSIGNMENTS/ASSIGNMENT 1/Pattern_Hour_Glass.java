import java.util.Scanner;

public class Pattern_Hour_Glass {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // n = 2*n + 1;
        int row = 1;
        int space = 0;
        int r = n;

        while(row <= 2*n + 1)
        {
            int sp = 1;
            while(sp <= space)
            {
                System.out.print(" \t");
                sp++;
            }
            int st = r;
            while(st>=0)
            {
                System.out.print(st + "\t");
                st--;
            }
            st += 2;
            while(st <= r)
            {
                System.out.print(st + "\t");
                st++;
            }

            if(row <= n)
            {
                row++;
                space++;
                r--;
            }
            else{
                row++;
                space--;
                r++;
            }
            System.out.println();
        }
    }
    
}
