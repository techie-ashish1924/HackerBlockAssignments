import java.util.Scanner;

public class Alex_Goes_Shopping {

    public static void Check(int arr[],int a,int b)
    {
        int sum = 0;
        for(int i=0;i<arr.length;i++)
        {
            if(a % arr[i] == 0)
            {
                // System.out.println("Condition true...");
                sum++;
            }
        }
        if(sum == b)
        {
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int prices[] = new int[n];
        for (int i = 0; i < prices.length; i++) {
            prices[i] = sc.nextInt();
        }
        int querry  = sc.nextInt();
        // int arr[][] = new int[querry][2];
        for (int i = 0; i < querry; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            Check(prices, a, b);
        }
    }
    
}
