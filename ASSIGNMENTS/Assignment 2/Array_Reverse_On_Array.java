import java.util.Scanner;

public class Array_Reverse_On_Array {

    public static void Reverse(int arr[])
    {
        int lo = 0;
        int hi = arr.length-1;

        while(lo <= hi)
        {
            int temp = arr[hi];
            arr[hi] = arr[lo];
            arr[lo] = temp;
            lo++;
            hi--;
        }
    }

    public static void Display(int arr[])
    {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        Reverse(arr);
        Display(arr);

    }
    
}
