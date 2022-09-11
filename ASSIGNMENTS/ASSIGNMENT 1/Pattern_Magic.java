
import java.util.*;
public class Pattern_Magic {
    
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        int sum = 1;
        int row = 0;
        int f_row = 2*n - 1;

        int str = (n - row) * 2;
        int space = 2*row - 1;

        while(sum <= f_row)
        {
            if(sum == 1 || sum == f_row )
            {
                str = 2*n - 1;;
                int s1 = 1;
                while(s1 <= str)
                {
                    System.out.print("*");
                    s1++;
                }
            }
            else{
                str = 2* (n-row)/2;
                int st1 = 1;
                while(st1 <= str)
                {
                    System.out.print("*");
                    st1++;
                }
                int sp1 = 1;
                space = 2 * row -1;
                while(sp1 <= space)
                {
                    System.out.print(" ");
                    sp1++;
                }
                while(st1 <= 2*(n-row))
                {
                    System.out.print("*");
                    st1++;
                }


                
            }
            if(sum <= n-1)
            {
                row++;
            }
            else{
                row--;
            }
            sum++;
            System.out.println();
            
        }


		 
    }


    
		

}

