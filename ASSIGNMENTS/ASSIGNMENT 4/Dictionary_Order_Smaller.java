
import java.util.*;
public class Dictionary_Order_Smaller {

    public static void main(String args[]) {
        // Your Code Here
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		char  [] ch1 = str1.toCharArray();
		Arrays.sort(ch1);
		String ques = String.valueOf(ch1);
		permutation_Values(ques,"",str1);
    }
	public static void permutation_Values(String ques, String ans,String val){
		if(ques.length()==0){
			if(val.compareTo(ans)>0){
            	System.out.println(ans);
			}
            return;
        }
        for (int i = 0; i < ques.length(); i++) {
            char ch = ques.charAt(i);
            String s1 = ques.substring(0,i);
            String s2 = ques.substring(i+1);
            permutation_Values(s1+s2,ans+ch,val);
        }
	}
}