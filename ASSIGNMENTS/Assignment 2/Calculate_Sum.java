import java.util.Scanner;

public class Calculate_Sum {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        // System.out.println("first array input start.................");
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }



        int no_querry = sc.nextInt();
        int querry[] = new int[no_querry];

        // System.out.println("Second array input start.................");

        for (int i = 0; i < querry.length; i++) 
        {
            querry[i] = sc.nextInt();
        }

        // System.out.println("operation start...........");

        for(int i=0;i<querry.length;i++)
        {
            
            if(querry[i] == 1)
            {
                int temp = arr[arr.length-1];

                for(int j=0;j<arr.length;j++)
                {
                    int val = arr[j];
                    arr[j] = arr[j] + temp;
                    temp = val;
                }
                // System.out.println("after performing 1 operation.........");
                // for (int j : arr) {
                    // System.out.print(j + " ");
                // }
                // System.out.println();
            }
            else if(querry[i] == 0)
            {
                for(int j=0;j<arr.length;j++)
                {
                    arr[j] = 2 * arr[j];
                    // System.out.println("value of arr[j] after performing operation . " + arr[j]);
                }
                // System.out.println("After performing 0 operation.............");
                // System.out.println("length of array after performing 0 ooperation....." + arr.length);
                // for (int j = 0; j < arr.length; j++) {
                    // System.out.print(arr[j] + " ");
                // }
                // System.out.println();
            }
        }
        // System.out.println("before s_sum");

        int f_sum = 0;
        for (int i = 0; i < arr.length; i++) {
            // System.out.print(arr[i] + " ");
            f_sum = f_sum +  arr[i];
        }
        // System.out.println();
        System.out.println(f_sum % 1000000007);

    }
    
}
