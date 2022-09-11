import java.util.Scanner;

public class Inverse_Array {

    public static void Inverse(int arr[])
    {
        int f_arr[] =  new int[arr.length];
        for (int i = 0; i < arr.length; i++) 
        {
            int ind = i;
            // System.out.println("index : " + ind);
            int val = arr[ind];
            // System.out.println("value : " + val);
            f_arr[val] = ind;
            System.out.println("-------------------------");

        }
        for (int i = 0; i < f_arr.length; i++) {
            System.out.print(f_arr[i] + " ");
        }
    }
    // public static void Display(int arr[])
    // {
        // for (int i = 0; i < arr.length; i++) {
            // System.out.print(arr[i] + " ");
        // }
    // }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

         Inverse(arr);

        //  Display(arr);
    }
    
}
