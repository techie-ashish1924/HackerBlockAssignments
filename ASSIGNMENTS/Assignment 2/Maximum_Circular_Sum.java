import java.util.Scanner;

public class Maximum_Circular_Sum {

    public static int Circular(int arr[])
    {
        int max = Integer.MIN_VALUE;
        int ind = 0;
        for (int i = 0; i < arr.length; i=i+2) {
            if((i%2 == 0)  && (i == arr.length-1))
            {
                if( (arr[i] + arr[0]) > max)
                {
                    // System.out.println("Last element ");
                    ind = i;
                }
                
            }
            else{
                if( (arr[i] + arr[i+1]) > max)
                {
                    max  = arr[i] + arr[i+1];
                    ind = i;
                }

            }
        }

        // System.out.println("Index is : " + ind);

        int sum = 0;
        // System.out.println("Sum : " + sum);
        int i = ind;
        // System.out.println("I : " + i);
        int f_sum = 0;
        while(sum < arr.length-1)
        {
            // System.out.println("loop start...............");
            if(i == arr.length -1)
            {
                // System.out.println("eleemnrt : " + arr[i]);
                f_sum = f_sum + arr[i];
                i=0;
            }
            else{
                // System.out.println("eleemnrt : " + arr[i]);
                f_sum = f_sum + arr[i];
                i++;
            }
            sum++;
        }
        return f_sum;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int test_case = sc.nextInt();

        while(test_case > 0)
        {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < arr.length; i++) 
            {
                arr[i] = sc.nextInt();
            }
            System.out.println(Circular(arr));

        }
        
        
        
        
        
        
    }
    
}
