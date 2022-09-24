import java.util.Scanner;

public class String_Odd_Even_Character {

public static void Even_Odd(String k)
{
    String res = "";
    for (int i = 0; i < k.length(); i++) {
        if(i%2 == 0  && k.charAt(i) < 'z')
        {
            res = res + (char)(k.charAt(i)+1);
        }
        else if(i%2 != 0 && k.charAt(i) > 'a')
        {
            res = res + (char)(k.charAt(i)-1);
        }
        else{
            res = res + k.charAt(i);
        }

        
    }
    System.out.println(res);
}

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        Even_Odd(a);

        // char a = 'b';
        // System.out.println((char)(a+1));
    }
    
}
