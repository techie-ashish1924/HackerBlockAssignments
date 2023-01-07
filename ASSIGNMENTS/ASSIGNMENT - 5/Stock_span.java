import java.util.*;
public class Stock_span {

	public static void main(String argstack[])  {

	
		Scanner sc = new Scanner(System.in);


		int n = sc.nextInt();

		int []numstack= new int[n];

		for(int i=0;i<n;i++)
		{
			numstack[i]= sc.nextInt();
		}

		Stack<Integer> stack= new Stack<>();


		int anstack[] = new int[n];
		for(int i=0;i<n;i++)
		{
			while(!stack.isEmpty() && numstack[i]>=numstack[stack.peek()])
			{
				stack.pop();
			}
			if(!stack.isEmpty())
			{
				anstack[i]= i-stack.peek();
				//stack.pop();
			}
			else
			{
				anstack[i]=i+1;
			}
			stack.push(i);
		}
		for(int i:anstack)
		{
			System.out.print(i+" ");
		}
		System.out.print("END");
		
	

	}

}