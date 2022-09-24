import java.util.Scanner;

public class From_Biggest_Number {
    public static void Biggest(int arr[])
    {
        String res ="";

        for(int i=1;i<=arr.length;i++)
        {
            for(int j=0;j<arr.length-i;j++)
            {
                String p1 = String.valueOf(arr[j]);
                String p2 = String.valueOf(arr[j+1]);
                if(Long.parseLong(p2+p1) > Long.parseLong(p1+p2))
                {
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            res = res + String.valueOf(arr[i]);
        }
        System.out.println(res);
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-->0)
        {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            Biggest(arr);
        }
    }
}
