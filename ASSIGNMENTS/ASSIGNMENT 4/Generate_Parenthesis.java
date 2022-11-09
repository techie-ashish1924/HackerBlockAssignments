
import java.util.*;
public class Generate_Parenthesis {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		func1("", 0 , 0 ,n1);
    }

	public static void func1(String s, int o,int c,int a){
		if(s.length() == 2*a){
			System.out.println(s);
			return;
		}

		if(c < o)
		func1(s+")", o, c + 1, a);
		if(o < a)
		func1(s+"(", o + 1, c, a);
		
	}
}
