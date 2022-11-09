
import java.util.*;
public class Split_Array {
    public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int x1=sc.nextInt();
		int []arr1=new int[x1];
		boolean []visited1=new boolean[x1];
		int total=0;
        for(int i=0;i<x1;i++){
			arr1[i]=sc.nextInt();
			total+=arr1[i];
		}
		System.out.println(calculate_data(arr1,0,visited1,total,0));
    }
	public static int calculate_data(int arr[],int i,boolean v[],int total,int s){
		if(i==arr.length){
			if(s+s==total){
				for(int j=0;j<arr.length;j++){
				if(v[j]){
					System.out.print(arr[j]+" ");
				}
			}
			System.out.print("and ");
			for(int j=0;j<arr.length;j++){
				if(!v[j]){
					System.out.print(arr[j]+" ");
				}
			}
			System.out.println();
			return 1;
			}
			return 0;
		}
		v[i]=true;
		int p=calculate_data(arr,i+1,v,total,s+arr[i]);
		v[i]=false;
		int q=calculate_data(arr,i+1,v,total,s);
		return p+q;
	}
}
