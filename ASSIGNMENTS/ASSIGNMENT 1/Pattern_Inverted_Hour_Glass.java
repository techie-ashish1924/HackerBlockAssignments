import java.util.Scanner;

public class Pattern_Inverted_Hour_Glass {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int row = 1;
        int space = 2*n + 1 - 2;
        int r = n;

        while(row <= 2*n + 1)
        {
            int str = n;
            while(str >= r)
            {
                System.out.print(str + " ");
                str--;
            }
            if(str == -1)
            {
                str += 1;
            }
            str++;
            int sp = 1;
            while(sp <= space)
            {
                System.out.print("  ");
                sp++;
            }
            while(str <= n)
            {
                System.out.print(str + " ");
                str++;
            }
            if(row <= (2*n +1)/2)
            {
                row++;
                space -= 2;
                r--;
            }
            else{
                row++;
                space += 2;
                r++;
            }
            System.out.println();

        }
    }
    
}
