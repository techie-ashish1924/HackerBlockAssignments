import java.util.Scanner;

public class All_Indices_Problem {

    public static void Find(int arr[],int ind,int targ)
    {
        if(ind == arr.length)
        {
            return;
        }

        if(arr[ind] == targ)
        {
            System.out.print(ind + " ");
        }

        Find(arr,ind+1,targ);
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int m = sc.nextInt();

        Find(arr, 0, m);

    
    }
    
}
