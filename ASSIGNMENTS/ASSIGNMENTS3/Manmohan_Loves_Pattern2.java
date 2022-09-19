import java.util.Scanner;

public class Manmohan_Loves_Pattern2 {


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        // int patt = 1;
        while(row<=n)
        {
            int i=1;
            while(i<=row)
            {
                if(i==1 || i==row)
                {
                    System.out.print(row-1);
                }
                else{
                    System.out.print("0");
                }
                i++;
            }
            System.out.println();
            row++;
            
        }
    }
    
}
