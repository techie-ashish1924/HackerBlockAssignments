import java.util.Scanner;

public class Prateek_Lovers_Candy {

    public static int Minimum_Cost(int n)
    {
        int i =2;
        if(n==1)
        {
            return 2;
        }
        else{

            int max = Integer.MIN_VALUE;
            
            while(n-->0)
            {
                int f = 1;
                for(int j=2;j<i;j++)
                {
                    if(n%j == 0)
                    {
                        f=0;
                    }

                }
                if(f==1)
                {
                    max = 
                }
            }

        }
       
       
       

       
    }



    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();

        while(test-->0)
        {

        }
    }
    
}
