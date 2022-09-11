import java.util.Scanner;

class ChewBacca_Number {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
		long arr[] = new long[18];
		int count = 0;
        while(n!=0)
        {
            long rem = n % 10;
            arr[count] = rem;
             count++;
            n = n/10;
        }
        for(int i=0;i<count;i++)
		{
			System.out.print(arr[i]);
		}
        System.out.println();
        for (int i = 0; i < count-1; i++) {
            if(arr[i] >= 5)
            {
                arr[i] = 9 - arr[i];
            }
            // else if()
        }
        if( arr[count-1] >= 5 && arr[count-1] <= 8)
        {
            arr[count-1] = 9-arr[count-1];
        }

        for(int i=count-1;i >= 0;i--)
		{
			System.out.print(arr[i]);
		}
        
    }
    
}
