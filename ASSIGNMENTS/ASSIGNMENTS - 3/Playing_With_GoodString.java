import java.util.Scanner;

public class Playing_With_GoodString {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < a.length(); i++) {

            if(a.charAt(i)=='a' || a.charAt(i) == 'e' || a.charAt(i) == 'i'  || a.charAt(i) == 'o' || a.charAt(i) == 'u')
            {
                sum++;
            }
            else{
                max =Math.max(max, sum);
            }   
        }

        System.out.println(max);
    }
    
}
