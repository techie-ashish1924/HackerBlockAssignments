import java.util.Scanner;

public class Shopping_Game {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int Aayush = sc.nextInt();
        int harshit = sc.nextInt();
        int a_sum = 1;
        int h_sum = 2;

        while(a_sum <= Aayush || h_sum <= harshit)
        {
            if(a_sum <= Aayush)
            {
                a_sum = a_sum + (a_sum+2);
            }
            if(h_sum <= harshit)
            {
                h_sum = h_sum + (h_sum + 2);
            }
            
        }
        if(a_sum < h_sum)
        {
            System.out.println("Harshit");
        }
        else if(h_sum < a_sum)
        {
            System.out.println("Aayush");
        }
    }
    
}
