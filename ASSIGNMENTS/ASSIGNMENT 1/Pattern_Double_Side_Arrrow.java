import java.util.Scanner;

public class Pattern_Double_Side_Arrrow {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int row = 0;
        int no_row = 1;
        int outer_space = n-1;
        int patt = 1;

        while(no_row <= n)
        {

            if(no_row == 1 || no_row == n)
            {
                int s1 = 1;
                while(s1 <= outer_space)
                {
                    System.out.print("  ");
                    s1++;
                }
                System.out.print("1");
            }
            else
            {

                // outer space loop....
                int s1 = 1;
                while(s1 <= outer_space)
                {
                    System.out.print("  ");
                    s1++;
                }
                // pattern print loop.....
                int patt_copy = patt;
                int p1 = 1;
                while(patt_copy >= p1)
                {
                    System.out.print(patt_copy+ " ");
                    patt_copy--;
                }
                int inn_s1 = 1;
                int inner_space = 2*row - 1;
                while(inn_s1 <= inner_space)
                {
                    System.out.print("  ");
                    inn_s1++;
                }
                int p2 = 1;
                while(p2 <= patt)
                {
                    System.out.print(p2 + " ");
                    p2++;
                }
            }

            if(no_row < (n/2)+1)
                {
                    row++;
                    outer_space -= 2;
                    patt++;
                }
                else
                {
                    row--;
                    outer_space += 2;
                    patt--;
                }

            no_row++;
            
            System.out.println();

            
        }

            }
            
    }
    

