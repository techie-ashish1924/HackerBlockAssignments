import java.util.Scanner;

public class Sorting_In_LinearTime {

    public static void LinearTime_Sort(int arr[])
    {
        int lo = 0;
        int n = arr.length;
        int hi = n-1;
        int mid = 0;

        while(mid <= hi)
        {
            if(arr[mid] == 0)
            {
                int temp = arr[mid];
                arr[mid] = arr[lo];
                arr[lo] = temp;
                lo++;
                mid++;
            }
            else if(arr[mid] == 1)
            {
                mid++;
            }
            else
            {
                int temp = arr[mid];
                arr[mid] = arr[hi];
                arr[hi] = temp;
                hi--;
            }
            

            // for (int j = 0; j < arr.length; j++) {
                // System.out.print(arr[i] + " ");
            // }
            // System.out.println();
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
        // int n = 6;
        int arr[] = new int[n];
        // int arr[] = {2,0,2,1,1,0};
        for (int i = 0; i < arr.length; i++) {
            arr[i]  =sc.nextInt();
        }

        // Display(arr);
        System.out.println("\n after sorting..............");
        LinearTime_Sort(arr);
        Display(arr);
        

        

    }
    
}
