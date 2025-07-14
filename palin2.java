public class palin2 {
    public static void main(String[] args) {
        
        String s = "abca";
        StringBuilder build = new StringBuilder(s);
        
        int i =0;
        int j = s.length()-1;

        boolean ans = true;
        while (i < j) {
            if (build.charAt(i) == build.charAt(j))  {
                i++;
                j--;
            }if (build.charAt(i) != build.charAt(j)) {
                 build.deleteCharAt(j);
                 j--;
            }
            else {
                ans = false;
                break;
        }
    }
        System.out.println(ans);
    }
}
