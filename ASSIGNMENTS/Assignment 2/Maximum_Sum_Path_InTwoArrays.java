import java.util.Scanner;

public class Maximum_Sum_Path_InTwoArrays {


    public static int Sum(int a[],int b[])
    {
        int f_sum = 0;
        int i = 0;
        int asum = 0;
        int bsum = 0;
        while( i< a.length && i < b.length)
        {
            if(a[i] == b[i])
            {
                asum += a[i];
                bsum += b[i];
                System.out.println(Math.max(asum, bsum));
                f_sum += Math.max(asum, bsum);
                asum = 0;
                bsum = 0;
            }
            else{
                asum += a[i];
                bsum += b[i];
            }

            i++;
        }
        
        if(asum > bsum)
        {
            return f_sum + asum;
        }
        else{
            return f_sum + bsum;
        }
        // return f_sum;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int test_case = sc.nextInt();
        while(test_case > 0)
        {
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            int arr1[] = new int[n1];
            int arr2[] = new int[n2];
            for (int i = 0; i < arr1.length; i++) {
                arr1[i] = sc.nextInt();
            }
            for (int i = 0; i < arr2.length; i++) {
                arr2[i] = sc.nextInt();
            }

            System.out.println(Sum(arr1, arr2));
            test_case--;
        }
    }
    
}
