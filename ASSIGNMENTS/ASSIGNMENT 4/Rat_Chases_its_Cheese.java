
import java.util.*;
public class Rat_Chases_its_Cheese {
	static boolean f = false;
    public static void main(String args[]) {
		 Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        char [][] maze = new char[n][m];
        for(int i=0;i<maze.length;i++){
            String str = sc.next();
            for(int j=0;j<str.length();j++){
                maze[i][j] = str.charAt(j);
            }
        }
        int [][] ans = new int [n][m];
        hasPath_func(maze,0,0,ans);
        if(f==false){
            System.out.println("NO PATH FOUND");
        }
    }
    public static void hasPath_func(char [][] maze,int cca, int cra, int[][] ans){
        if(cra==maze.length-1 && cca==maze[0].length-1 && maze[cra][cca]!='X'){
            ans[cra][cca]=1;
            Display_func(ans);
            f=true;
            return;
        }
        if(cra<0 || cca<0 || cra>=maze.length || cca>=maze[0].length || maze[cra][cca]=='X'){
            return;
        }
        maze[cra][cca] = 'X';
        ans[cra][cca]=1;
        int r[] = {-1,1,0,0};
        int c[] = {0,0,-1,1};
        for(int i=0;i<c.length;i++){
            hasPath_func(maze,cca+c[i],cra+r[i],ans);
        }
        maze[cra][cca] = 'O';
        ans[cra][cca]=0;
    }
    public static void Display_func(int [][] ans){
        for(int i=0;i<ans.length;i++){
            for(int j=0;j<ans[0].length;j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
}
