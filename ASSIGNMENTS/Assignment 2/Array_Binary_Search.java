import java.util.Scanner;

public class Array_Binary_Search {

    public static int Binary_Search(int arr[] ,int target)
    {
        int lo = 0;
        int hi = arr.length - 1;

        while(lo <= hi)
        {
            int mid  = lo + (hi - lo)/2;
            if(arr[mid] == target)
            {
                return mid;
            }
            else if(arr[mid] > target)
            {
                hi = mid - 1;
            }
            else if(arr[mid] < target)
            {
                lo = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        System.out.println(Binary_Search(arr, target));
    }
    
}
