import java.util.ArrayList;
import java.util.Scanner;

public class Can_You_Read_This {

    public static void Check(String k)
    {
        System.out.println(k.su);
        // System.out.println(k);
        String z = String.valueOf(k.charAt(0));
        ArrayList<String> res = new ArrayList<>();
        for (int i = 1; i < k.length(); i++) {
            
            if(k.charAt(i) >= 'A' && k.charAt(i) <= 'Z')
            {
                res.add(z);
                z = "";
                z = z + k.charAt(i);
            }
            else{
                z = z + k.charAt(i);
            }
            // res.add(z);
        }
        res.add(z);
        for (int i = 0; i < res.size(); i++) {
            System.out.println(res.get(i));
        }
    }


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        Check(a);

    }
    
}
