public class palin2 {
    public static void main(String[] args) {
     String s = "abca";
 int i = 0;
        int j = s.length() - 1;
        boolean valid = true;

        while (i < j) {
            if (s.charAt(i) == s.charAt(j)) {
                i++;
                j--;
            } else {
                // Check skipping left char
                boolean skipLeft = true;
                int x = i + 1,
                 y = j;
                while (x <= y) {
                    if (s.charAt(x) != s.charAt(y)) {
                        skipLeft = false;
                        break;
                    }
                    x++;
                    y--;
                }

                // // Check skipping right char
                boolean skipRight = true;
                x = i;
                y = j - 1;
                while (x <= y) {
                    if (s.charAt(x) != s.charAt(y)) {
                        skipRight = false;
                        break;
                    }
                    x++;
                    y--;
                }

                valid = skipLeft || skipRight;
                // valid = skipLeft;
                break;  // One deletion allowed only
            }
        }
        System.out.println(valid);
       
    }
}
