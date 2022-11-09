
import java.util.*;
public class Vivek_Loves_Array {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int test_case = sc.nextInt();
		while(test_case -- > 0){
			int n1 = sc.nextInt();
			int arr1[] = new int[n1];
			for(int i = 0; i < n1; i++)
			arr1[i] = sc.nextInt();

			int sum[] = new int[n1+1];
			for(int j = 1; j <= n1; j++)
				sum[j] = sum[j-1] + arr1[j-1];

			System.out.println(count_data(arr1, sum, 0, n1-1));
		}
    }

	public static int count_data(int[] arr, int[] sum, int s, int e){
		if(s >= e)
		return 0;

		if((s+1) == e){
			if(arr[s] == arr[e])
			return 1;
			else 
			return 0;
		}

		int total = 0;
		for(int x = s; x < e; x++){
			if( (sum[x+1] - sum[s]) == (sum[e+1] - sum[x+1])){
				int temp = Math.max(count_data(arr, sum, s, x) , count_data(arr, sum, x+1, e)) +1;
				total = Math.max(total, temp);
				break;
			}
		}
		return total;
	}
}