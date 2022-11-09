
import java.util.*;
public class Maze_path_Count_Print2 {
  static int c =0 ;
    public static void main(String args[]) {
    Scanner sc  = new Scanner(System.in);
    int p1 = sc.nextInt();
    int q1 = sc.nextInt();
    mazePath_cal(p1,q1,0,0,"");
    System.out.println("\n"+c);
    }
  public static void mazePath_cal(int x, int y, int p , int q, String str){
    if(p==x-1 && q==y-1){
      c++;
      System.out.print(str+" ");
      return;
    }
    if(p>=x || q>=y) return;
    mazePath_cal(x,y, p+1, q, str+'V');
    mazePath_cal(x,y, p, q+1, str+'H');
  }
}
