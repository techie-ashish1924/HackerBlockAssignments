import java.util.*;
 class Is_Armstrong {
	public static int length(int n)
	{
		int sum = 0;
		while(n>0)
		{
			sum++;
			n=n/10;
		}
		System.out.println(sum);
		return sum;

	}
	public static boolean ArmStrong(int n)
	{
		int len = length(n);
		double sum = 0;
		int val = n;
		while(n>0)
		{
			int rem = n%10;
            System.out.println(rem);
			sum = sum +   Math.pow(rem,len);
            System.out.println(sum);
			n = n/10; 

		}
        System.out.println(sum);
		return (int)sum==val?true:false;

	}
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		// int val = ArmStrong(n)
		 
		System.out.println(ArmStrong(n));

    }
}