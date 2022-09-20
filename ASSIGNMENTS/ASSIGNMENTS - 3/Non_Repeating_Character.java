import java.util.Scanner;

public class Non_Repeating_Character {

    public static void Chech(String k)
    {
        int arr[] = new int[26];
        for (int i = 0; i < k.length(); i++) {
            
            arr[k.charAt(i)-97]++;
        }

        for (int i = 0; i < k.length(); i++) {
            
            if(arr[k.charAt(i)-97] == 1)
            {
                System.out.println(k.charAt(i));
                break;
            }
        }
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-->0)
        {
            String a = sc.next();
            Chech(a);
        }
    }
    
}
