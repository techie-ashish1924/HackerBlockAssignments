import java.util.Scanner;

public class Pattern_Rhombus {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int space = n-1;
        int i = 1;
        int r=1;

        while(row <= (2* n)-1)
        {
            int sp = 1;
            while(sp <= space)
            {
                System.out.print(" \t");
                sp++;
            }
            int st =  r;            
            while(st <= i)
            {
                System.out.print(st + "\t");
                st++;
            }
            st -= 2;
            while(st >= r)
            {
                System.out.print(st + "\t");
                st--;
            }
            if(row <= (2*n -1)/2 )
            {
                r++;
                space--;
                i += 2;
                row++;
            }
            else{
                // System.out.println("nimber os space " + space);
                // System.out.println("number of r : " + r);
                // System.out.println("number of i : " + i);
                // System.out.println("hello.........");
                space++;
                i -= 2;
                r--;
                row++;
            }
            
            System.out.println();
        }
    }
    
}
