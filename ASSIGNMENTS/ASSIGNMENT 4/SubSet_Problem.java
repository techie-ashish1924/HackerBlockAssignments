import java.util.ArrayList;
import java.util.Scanner;

public class SubSet_Problem {

    // public static int count = 0;
    public static void Subset(int arr[],int ind,int targ, ArrayList<Integer> ans)
    {
        if(targ == 0)
        {
            for (int i = 0; i < ans.size(); i++) {
                System.out.print(ans.get(i) + " ");
            }
            System.out.print(" ");
            // System.out.println(ans);
            // count++;
            return;
        }

        if(ind == arr.length)
        {
            return;
        }

        for(int i=ind;i<arr.length;i++)
        {
            if(targ >= arr[i])
            {
                ans.add(arr[i]);
                Subset(arr, ind+1, targ - arr[i], ans);
                ans.clear();
            }
        }

    }


    public static int SubsetCount(int arr[],int ind,int targ, int ans)
    {
        if(targ == 0)
        {
            // System.out.println("aya....................");
            ans++;
            return ans;
        }

        if(ind == arr.length)
        {
            return 0;
        }

        for(int i=ind;i<arr.length;i++)
        {
            if(targ >= arr[i])
            {
            
                ans = SubsetCount(arr, ind+1, targ - arr[i], ans);
            
            }
        }
        return ans;

    }


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int targ = sc.nextInt();

        ArrayList<Integer> ans = new ArrayList<>();
        // int count = 0;
        Subset(arr, 0, targ, ans);
        
        // System.out.println("sdfghjk,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,");
        System.out.println("\n" + SubsetCount(arr, 0, targ, 0));
    }
    
}
