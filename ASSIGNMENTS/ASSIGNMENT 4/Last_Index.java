import java.util.Scanner;

public class Last_Index {

    public static int LastIndex(int arr[],int strt,int targ)
    {
        if(strt < 0)
        {
            // System.out.println(strt);
            return -1;
        }

        if(arr[strt] == targ)
        {
            // System.out.println("Targe condirion..............." + strt);
            return strt;
        }
        // System.out.println(strt);
        return LastIndex(arr, strt-1,targ);
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }
        
        int m = sc.nextInt();

        System.out.println(LastIndex(arr, arr.length-1, m));



    }
    
}
