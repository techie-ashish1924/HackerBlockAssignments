import java.util.Scanner;

public class Pattern_Triangle {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int space = n-1;
        int i = 1;

        while(row <= n)
        {
            int sp = 1;
            while(sp <= space)
            {
                System.out.print("  ");
                sp++;
            }
            int st =  row;
            while(st <= i)
            {
                System.out.print(st + " ");
                st++;
            }
            st -= 2;
            while(st >= row)
            {
                System.out.print(st + " ");
                st--;
            }

            row++;
            space--;
            i += 2;
            System.out.println();
        }
    }
}
