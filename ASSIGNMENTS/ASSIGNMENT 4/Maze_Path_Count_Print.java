
import java.util.*;
public class Maze_Path_Count_Print {
   public static int maze_path_func(int cr,int cc,int er,int ec,String ans,int count){
        if(cr==er && cc==ec){
            System.out.print(ans+" ");
            return count+1;
        }
        if(cr>er || cc>ec){
            return count;
        }
        count = maze_path_func(cr+1,cc,er,ec,ans+"V",count);
        count = maze_path_func(cr,cc+1,er,ec,ans+"H",count);
        count = maze_path_func(cr+1,cc+1,er,ec,ans+"D",count);
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p1 = sc.nextInt();
        int q1 = sc.nextInt();
        System.out.println("\n"+maze_path_func(0,0,p1-1,q1-1,"",0));
    }
}
