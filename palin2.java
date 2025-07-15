public class palin2 {
    public static void main(String[] args) {
     String s = "abcccdda";

     int i =0;
     int j = s.length()-1;

     boolean ans = false;
     while (i < j) {
        if (s.charAt(i) == s.charAt(j)) {
            i++;
            j--;
            ans = false;
        }else if (s.charAt(i) != s.charAt(j)) {
            boolean leftskip = true;
            int x = i+1;
            int y = j;
            while (x <= j) {
                if (s.charAt(x) != s.charAt(y)) {
                    leftskip = false;
                    break;
                }else{
                    x++;
                    y--;
                }
            }

            boolean rightskip = true;
            int xx = i;
            int yy = j-1;

            while (xx <= yy) {
                if (s.charAt(xx) == s.charAt(yy)) {
                    rightskip = false;
                    break;
                }else{
                    xx++;
                    yy--;
                }
            }
            if (leftskip || rightskip == true) {
                ans = true;
                break;
            }
        }
       
     }
    System.out.println(ans);
    }
}
