public class palin2 {
    public static void main(String[] args) {
     String s = "abda";

        int i = 0;
        int j = s.length() - 1;
        boolean valid = true;

        while (i < j) {
            if (s.charAt(i) == s.charAt(j)) {
                i++;
                j--;
            } else {
                // Try skipping left character (i + 1)
                boolean skipLeft = true;
                int x = i + 1, y = j;
                while (x < y) {
                    if (s.charAt(x) != s.charAt(y)) {
                        skipLeft = false;
                        break;
                    }
                    x++;
                    y--;
                }

                // Try skipping right character (j - 1)
                boolean skipRight = true;
                x = i;
                y = j - 1;
                while (x < y) {
                    if (s.charAt(x) != s.charAt(y)) {
                        skipRight = false;
                        break;
                    }
                    x++;
                    y--;
                }

                if (!skipLeft && !skipRight) {
                    valid = false;
                }

                break; // We've already used our one allowed skip
            }
        }

        System.out.println(valid);
    }
}
