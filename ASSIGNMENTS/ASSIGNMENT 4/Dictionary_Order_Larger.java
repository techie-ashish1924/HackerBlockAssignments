
    import java.util.*;
    public class Dictionary_Order_Larger {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String str1 = sc.next();
            char char1[] = str1.toCharArray();
            List<String> ans = new ArrayList<>();
            permute_val(0, str1.length(), char1, str1, ans);
            Collections.sort(ans);
            for(String str : ans)
            System.out.println(str);
        }
    
        public static void permute_val(int curr, int end, char ch[], String str1, List<String> ans) {
            if (curr == end) {
                if(String.copyValueOf(ch).compareTo(str1) > 0)
                ans.add(String.copyValueOf(ch));
                return;
            }
    
            for (int x = curr; x < end; x++) {
                swap_val(curr, x, ch);
                permute_val(curr + 1, end, ch, str1, ans);
                swap_val(curr, x, ch);
            }
        }
    
        public static void swap_val(int i, int j, char[] ch) {
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
        }
    }