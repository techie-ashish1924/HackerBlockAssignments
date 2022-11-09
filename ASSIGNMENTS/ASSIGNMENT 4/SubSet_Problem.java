import java.util.*;
public class SubSet_Problem {
    public static int subset_Find(int[] arr,int idx,int target,String str1,int count){
        if(idx==arr.length){
            if(target==0){
                System.out.print(str1+" ");
                return count+1;
            }
            return count;
        }
        count = subset_Find(arr,idx+1,target-arr[idx],str1+arr[idx]+" ",count);
        count = subset_Find(arr,idx+1,target,str1,count);
       
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int[] arr1 = new int[x1];
        for(int i=0;i<x1;i++){
            arr1[i] = sc.nextInt();
        }
        int target_val = sc.nextInt();
        System.out.println("\n"+subset_Find(arr1,0,target_val,"",0));
    }
}