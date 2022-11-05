/* import java.util.Scanner;

public class Finding_CB_Number {

    public static boolean CB_Number(String a)
    {
        int val = Integer.parseInt(a);
        if(val == 0 || val == 1)
        {
            System.out.println("0 or 1");
            return false;
        }
        else if(val==2 || val == 3 || val == 5 || val == 7 || val == 11 || val == 13 || val == 17 || val == 19 || val == 23 || val == 29)
        {
            System.out.println("double equals to condition");
            return true;
        }
        else if(val%2 != 0 && val%3 != 0 && val%5 != 0 && val%7 != 0 && val%11 != 0 && val%13 != 0 && val%17 != 0 && val%19 != 0 && val%23 != 0 && val%29 != 0)
        {
            System.out.println("val not modulo");
            return true;
        }
        else{
            System.out.println("Else condition");
            return false;
        }

    }

    public static int Count(String k)
    {
        int sum = 0;
        for(int i=0;i<k.length();i++)
        {
            String res = "";
            for(int j = i ;j<k.length();j++)
            {
                res = res + k.charAt(j);
                System.out.println(res);
                if(res.length() != k.length())
                {

                
                if(CB_Number(res))
                {
                    sum++;
                    System.out.println("--------------------------------------");
                    System.out.println(sum);
                    System.out.println("------------------------------------------");
                }
            }
                
            }
        }
    
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str1 = sc.next();
        System.out.println(Count(str1));
    }
    
}

*/


import java.util.*;
public class Finding_CB_Number 
{
    public static void main(String args[]) {
       Scanner sc=new Scanner(System.in);
	   int n1=sc.nextInt();
	   String s1=sc.next();
	   boolean visited[]=new boolean[s1.length()];
	   int c=0;
	   for(int len=1;len<=s1.length();len++){
		   for(int pos=0;pos<=s1.length()-len;pos++){
			   int end=pos+len;
			   String str=s1.substring(pos,end);
			   if(CBcheck(Long.valueOf(str),pos,end)&&isValid(visited,pos,end)){
				   c++;
				   for(int k=pos;k<end;k++)
				   {
				    visited[k]=true;
				   }
			   }
		   }
	   }
	   System.out.print(c);
    }


	public static boolean CBcheck(long  num1,int start,int end)
	{
		if(num1 == 0 || num1 == 1)
		{
			return false;
		}
		int x[]={2,3,5,7,11,13,17,19,23,29};
		for(int i=0;i<10;i++)
		{
			if(num1 == (long)x[i])
			{
				return true;
			}
		}
		for(int i=0;i<10;i++)
		{
			if(num1 % x[i]==0)
			{
				return false;
			}
		}
		return true;
	}


	public static boolean isValid(boolean visited1[],int start,int end)
	{
		for(int i=start;i<end;i++){
			if(visited1[i])
			{
				return false;
			}
		}
		return true;
	}
}