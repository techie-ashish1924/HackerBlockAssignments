import java.util.Scanner;

public class Mirror_Star_Pattern5 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int space = n-3;
        int patt = 1;

        while(row <= n)
        {
            int sp = 1;
            int pt = 1;

            while(sp <= space)
            {
                System.out.print("  ");
                sp++;
            }
            while(pt <= patt)
            {
                System.out.print("* ");
                pt++;
            }

            if(row < (n/2)+1)
            {
                space -= 1;
                patt += 2;
            }
            else{
                space += 1;
                patt -= 2;
            }
            System.out.println();
            row++;

        }
    }
    
}
