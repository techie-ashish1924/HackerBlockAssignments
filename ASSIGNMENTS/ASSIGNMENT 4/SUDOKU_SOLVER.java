
import java.util.*;
public class SUDOKU_SOLVER {
    public static void dis_func(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static boolean isSafe_func(int[][] arr,int r,int c,int num){
        for(int i=0;i<arr.length;i++){
            if(arr[r][i]==num){
                return false;
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i][c]==num){
                return false;
            }
        }
        r = (r/3)*3;
        c = (c/3)*3;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(arr[r+i][c+j]==num){
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean sudokuSolver_func(int[][] arr,int r,int c){
        if(r==arr.length){
            dis_func(arr);
            return true;
        }
        if(c==arr[0].length){
            return sudokuSolver_func(arr,r+1,0);
        }
        if(arr[r][c]!=0){
            return sudokuSolver_func(arr,r,c+1);
        }
        for(int i=1;i<=9;i++){
            if(isSafe_func(arr,r,c,i)){
                arr[r][c] = i;
                boolean res = sudokuSolver_func(arr,r,c+1);
                if(res){
                    return true;
                }
                arr[r][c] = 0;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        sudokuSolver_func(arr,0,0);
    }
}
