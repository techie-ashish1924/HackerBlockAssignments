import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class Rat_Chases_Its_Chance {

    static boolean f = false;
    public static void Display(int arr[][])
    {
        for (int i = 0; i < arr.length; i++) {
            
            for (int j = 0; j < arr[i].length; j++) {
                
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void HasPath(char [][]maze,int c_row,int c_col,int ans[][])
    {
        // System.out.println("START");
        if((c_row == maze.length-1) && (c_col == maze[0].length - 1) && (maze[c_row][c_col] != 'X'))
        {
            ans[c_row][c_col] = 1;
            // System.out.println("hello");
            f = true;
            Display(ans);
            return;
            
        }

        if(c_col < 0 || c_row < 0 || c_row >= maze.length || c_col >= maze[0].length || maze[c_row][c_col] == 'X')
        {
            return;
        }

        maze[c_row][c_col] = 'X';

        ans[c_row][c_col] = 1;

        HasPath(maze, c_row-1, c_col,ans);  // UP
        HasPath(maze, c_row+1, c_col,ans);  // DOWN
        HasPath(maze, c_row, c_col-1,ans);  // LEFT
        HasPath(maze, c_row, c_col+1,ans);  // RIGHT

        maze[c_row][c_col] = 'O';


        ans[c_row][c_col] = 0;
    }


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        char maze[][] = new char[n][m];
        int arr[][] = new int[n][m];
        for(int i=0;i<maze.length;i++)
        {
            String str = sc.next();

            for (int j = 0; j < str.length(); j++) 
            {
                maze[i][j] = str.charAt(j);
                
            }
        }

        HasPath(maze, 0, 0, arr);

        if(f == true)
        {
            System.out.println("PATH FOUND");
        }
        else{
            System.out.println("NO PATH FOUND");
        }

    }
    
}
