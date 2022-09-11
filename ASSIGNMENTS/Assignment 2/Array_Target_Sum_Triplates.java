import java.util.Arrays;
import java.util.Scanner;

public class Array_Target_Sum_Triplates {

    public static void Triplates(int arr[] , int target)
    {
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++)
        {
            for (int j = i+1; j < arr.length; j++) {
                for (int j2 = j+1; j2 < arr.length; j2++) {
                    if(arr[i] + arr[j] + arr[j2] == target)
                    {
                        System.out.println(arr[i] + ", " + arr[j] + " and " + arr[j2]);
                    }
                }
                
            }
        }
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();

        Triplates(arr, target);
    }
    
}
