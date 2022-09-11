import java.util.Scanner;

public class Arrays_max_Value_in_Array {

    public static int Find_Max(int arr[])
    {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max,arr[i]);
        }
        return max;
    }


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Find_Max(arr));

    }
    
}
