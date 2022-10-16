import java.lang.annotation.Target;
import java.util.Scanner;

public class First_Index {

    public static int First_Index(int arr[],int ind,int targ)
    {
        if(ind == arr.length)
        {
            return -1;
        }

        if(arr[ind] == targ)
        {
            return ind;
        }

        return First_Index(arr, ind+1, targ);
    }

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         int arr[] = new int[n];
         for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
         }
         int m = sc.nextInt();

         System.out.println(First_Index(arr, 0, m));

    }
    
}
