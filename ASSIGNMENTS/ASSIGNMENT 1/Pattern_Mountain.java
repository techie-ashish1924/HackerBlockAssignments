import java.util.Scanner;

public class Pattern_Mountain {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int row = 1;
        int space = n+1;
        int r = 1;

        while(row <= n)
        {
            int st = 1;
            while(st <= r)
            {
                System.out.print(st + " ");
                st++;
            }
            if(st == n+1)
            {
                st -= 2;
            }
            else{
                st--;
            }
            
            int sp = 1;
            while(sp <= space)
            {
                System.out.print("  ");
                sp++;
            }
            while(st >= 1)
            {
                System.out.print(st + " ");
                st--;
            }
            row++;
            space -= 2;
            r++;
            System.out.println();
        }
    }
    
}
