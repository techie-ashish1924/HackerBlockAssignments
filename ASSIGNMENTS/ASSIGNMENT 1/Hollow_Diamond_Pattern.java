import java.util.Scanner;

public class Hollow_Diamond_Pattern {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int no_row = 1;
        int row = 0;

        while(no_row <= n)
        {
            if(no_row == 1 || no_row == n)
            {
                int star = n;
                // System.out.println("star..... when n==1 or n==5" + star);
                int s = 1;
                while(s <= star)
                {
                    System.out.print("*");
                    s++;
                }
            }
            else
            {
                int star = (n - 2* (row -1))/2;
                int st1 = 1;
                while(st1 <= star)
                {
                    System.out.print("*");
                    st1++;
                }
                int sp = 2*row - 1;
                int s1 = 1;
                while(s1 <= sp)
                {
                    System.out.print(" ");
                    s1++;
                }
                while(st1 < (n - 2* (row -1)))
                {
                    System.out.print("*");
                    st1++;
                }
            }
            if(no_row <= n/2)
            {
              
                row++;
            }
            else{
                row--;
            }
            no_row++;
            System.out.println();
        }


    }
    
}
