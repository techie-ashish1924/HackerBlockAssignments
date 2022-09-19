import java.util.Scanner;

public class String_Compressions {

    public static void StringComp(String k)
    {

        char prev = k.charAt(0);
        
        String res = "";
        int sum = 1;
        for (int i = 1; i < k.length(); i++) {
           
            if(k.charAt(i) == prev)
            {
                sum++;
                // System.out.println(sum);
            }
            else{
                // System.out.println("Character break" + k.charAt(i));
                res = res + String.valueOf(prev) + String.valueOf(sum);
                // System.out.println(res);
                sum = 1;
                prev = k.charAt(i);

            }
            
        }
        res = res + String.valueOf(prev) + String.valueOf(sum);
        System.out.println(res);
         
    }


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        StringComp(a);
    }
    
}
