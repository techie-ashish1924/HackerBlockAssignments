import java.util.Scanner;

public class Tower_OF_Hinoi {

    public static void Tower(int n, String src, String hlp, String des)
    {
        if(n==0)
        {
            return;
        }
        Tower(n-1,src , des, hlp);
        System.out.println("Moving ring " + n + " from " + src + " to " + des);
        Tower(n-1, hlp, src, des);
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String src = "A";
        String des = "B";
        String hlp = "C";

        Tower(n, src, hlp, des);

    }
    
}
