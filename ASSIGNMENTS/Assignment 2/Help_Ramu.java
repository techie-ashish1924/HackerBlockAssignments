import java.util.Scanner;

public class Help_Ramu {


    public static int Solution(int cost[],int rick[],int cab[])
    {
        int ans = 0;
        int sum = 0;
        for (int i = 0; i < rick.length; i++) {
            sum += Math.min(rick[i]*cost[0] , cost[1]);
        }
        ans += Math.min(sum, cost[2]);
        sum = 0;
        for (int i = 0; i < cab.length; i++) {
            sum += Math.min(cost[0]*cab[i], cost[1]);
        }
        ans += Math.min(sum, cost[2]);

        ans = Math.min(ans, cost[3]);
        return ans;
    }


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        // int no_cost = sc.nextInt();
        int test = sc.nextInt();

        while(test-->0)
        {

            int cost[] = new int[4];
            for (int i = 0; i < cost.length; i++) {
                cost[i] = sc.nextInt();
            }
            int no_rick = sc.nextInt();
            int rick[] = new int[no_rick];
            int no_cab = sc.nextInt();
            int cab[] = new int[no_cab];
            for (int i = 0; i < rick.length; i++) {
                rick[i]= sc.nextInt();
            }
            for (int i = 0; i < cab.length; i++) {
                cab[i] = sc.nextInt();
            }
            System.out.println(Solution(cost, rick, cab));

        }
        
        
        
        
        
    }
    
}
