
import java.util.*;
public class N_Queen_Problem {
	static int count = 0;


    public static void positions_func(boolean[][] posi, int n, int i){
		if(n == 0){
			count++;
			display_func(posi);
			return;
		}

		for(int x = 0; x < posi.length; x++){
			if(isSafe_func(posi, i, x)){
				posi[i][x] = true;
				positions_func(posi, n-1, i+1);
				posi[i][x] = false;
			}
		}
	}

	public static boolean isSafe_func(boolean[][] posi, int row, int col){
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

	public static void display_func(boolean[][] posi){
		for(int x = 0; x < posi.length; x++){
			for(int y = 0; y < posi[0].length; y++)
			if(posi[x][y])
			System.out.print("{" + (x+1) + "-" + (y+1) + "} ");
		}
		System.out.print(" ");
	}


	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		boolean posi[][] = new boolean[n][n];
		positions_func(posi, n, 0);
		System.out.println("\n" + count);
    }
}
