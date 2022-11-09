

import java.util.*;
public class Boardpath {
    public static int boardpath_func(int curr1,int end,int f,String answer,int count){
        if(curr1==end){
            System.out.print(answer+" ");
            return count+1;
        }
        if(curr1>end){
            return count;
        }
        for(int i=1;i<=f;i++){
            count = boardpath_func(curr1+i,end,f,answer+i,count);
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();// number of size
        int b = sc.nextInt();// number of dice faces
        System.out.println("\n"+boardpath_func(0,a,b,"",0));
    }
}
