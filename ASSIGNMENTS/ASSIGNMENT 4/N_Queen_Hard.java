
import java.util.*;
public class N_Queen_Hard {
	static int count = 0;
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int p1 = sc.nextInt();
		boolean posi1[][] = new boolean[p1][p1];
		positions_Find(posi1, p1, 0);
		System.out.println("\n" + count);
    }

	public static void positions_Find(boolean[][] posi, int p, int i){
		if(p == 0){
			count++;
			return;
		}

		for(int q = 0; q < posi.length; q++){
			if(IsSafe(posi, i, q)){
				posi[i][q] = true;
				positions_Find(posi, p-1, i+1);
				posi[i][q] = false;
			}
		}
	}

	public static boolean IsSafe(boolean[][] posi, int row, int col){
		int r = row;
		while(r >= 0){
			if(posi[r][col])
				return false;
			
			r--;
		}

		int c = col;
		r = row;
		while(r >= 0 && c >= 0){
			if(posi[r][c])
			return false;

			r--;
			c--;
		}

		c = col;
		r = row;
		while(r >= 0 &&  c < posi[0].length){
			if(posi[r][c])
			return false;

			r--;
			c++;
		}

		return true;
	}
}