import java.util.Scanner;

public class Pattern_HourGlass {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int row = n;
        int space = n-row;
        
        while(row >= 0)
        {
            int sp1 = 1;
            while(sp1 <= space)
            {
                System.out.print("  ");
                sp1++;
            }
            int strt = row;
            while(strt >= 0)
            {
                System.out.print(strt + " ");
                strt--;
            }
            strt += 2;
            System.out.println(strt);
            while(strt <= row)
            {
                System.out.print(strt + " ");
                strt++;
            }

            // if(row >= 1)
            // {
            //     row--;
            //     space += 1;
            // }
            // else{
            //     row++;
            //     space -= 2;
            // }
            // else{
            row++;
            space -= 1;
            
            // space += 1;
            System.out.println();
        }
    }
    
}
