import java.util.*;
public class Chessboard_Problem {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        char ch[] = str1.toCharArray();
		List<String> a = new ArrayList<>();
        permute_func(0, str1.length(), ch, str1, a);
		Collections.sort(a);
		for(String str : a)
		System.out.println(str);
    }

    public static void permute_func(int c, int e, char ch[], String str1, List<String> ans) {
        if (c == e) {
			if(String.copyValueOf(ch).compareTo(str1) > 0)
            ans.add(String.copyValueOf(ch));
            return;
        }

        for (int x = c; x < e; x++) {
            swap_func(c, x, ch);
            permute_func(c + 1, e, ch, str1, ans);
            swap_func(c, x, ch);
        }
    }

    public static void swap_func(int i, int j, char[] ch) {
        char temp = ch[i];
        ch[i] = ch[j];
		ch[j] = temp;
    }
}