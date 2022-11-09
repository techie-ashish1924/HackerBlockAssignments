
import java.util.*;
public class Rate_In_Maze {
	static boolean flag = false;
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int p1 = sc.nextInt();
		int q1 = sc.nextInt();
		int ar1[][] = new int[p1][q1];
		int ans1[][] = new int[p1][q1];

		for(int x = 0; x < p1; x++){
			String s = sc.next();
			for(int y = 0; y < q1; y++)
				ar1[x][y] = s.charAt(y);
		}

		findpath(ar1, ans1, 0, 0);
		if(!flag)
		System.out.println("-1");
    }

	public static void findpath(int[][] ar, int ans[][], int i, int j){
		if(ans.length-1 == i && ans[0].length-1 == j && ar[i][j] != 'X'){
			ans[i][j] = 1;
			flag = true;
			Display(ans);
			return;
		}

		if(i >= ans.length || j >=ans[0].length || ar[i][j] == 'X' || flag)
		return;

			ar[i][j] = 'X';
			ans[i][j] = 1;

			findpath(ar, ans, i, j+1);
			findpath(ar, ans, i+1, j);
			
			ar[i][j] = '0';
			ans[i][j] = 0;
	}

	public static void Display(int[][] ans){
		for(int x = 0; x < ans.length; x++){
			for(int y = 0; y < ans[0].length; y++)
				System.out.print(ans[x][y] + " ");

			System.out.println();
		}
	}
}