import java.util.Scanner;

public class Product_Element_ExceptSelf {

    public static void Product(long arr[])
    {
        int n = arr.length;
        long left[] = new long[n];
        long rigth[] = new long[n];
        left[0] = 1;
        rigth[n-1]= 1;

        for (int i = 1; i < rigth.length; i++) {
            left[i] = left[i-1] * arr[i-1];
        }
        for (int i = n-2; i >=0 ; i--) {
            rigth[i] = rigth[i+1] * arr[i+1];
        }
        for (int i = 0; i < rigth.length; i++) {
            arr[i] = left[i] * rigth[i];
        }
    }

    public static void Display(long arr[])
    {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long arr[] = new long[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        Product(arr);
        Display(arr);
    }
    
}
