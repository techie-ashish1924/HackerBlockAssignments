import java.util.Scanner;

public class SUbArray_Having_Product_Less_Than_K {

    public static int Calculate(int arr[],int k)
    {
        int strt = 0;
        int end = 0;
        int ans = 0;
        int mul = 1;

        while(end < arr.length)
        {
            // window grow......
            mul = mul * arr[end];
            // window shrink.....
            while(mul >= k && strt <= end)
            {
                mul = mul/arr[strt];
                strt++;
            }
            // calculate ans
            ans = ans + end - strt + 1;
            end++;

        }
        return ans;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
       

        System.out.println(Calculate(arr, k));
    }
    
}
