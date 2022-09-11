import java.util.Scanner;

public class Pattern_With_Zero {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int row = 1;
        
        while(row <= n)
        {
            int st = 1;
            while(st <= row) 
            {
                if(st==1 ||st==row)
                {
                    System.out.print(row + " ");

                }   
                else{
                    System.out.print("0" + " ");
                }
                st++;
            }
            row++;
            System.out.println();
        }
    }
    
}
