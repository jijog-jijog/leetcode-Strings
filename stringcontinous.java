public class stringcontinous {
    public static void main(String[] args) {
        String s = "1001";

        boolean ans = false;
        for(int i =0; i<s.length(); i++){
            char ch = s.charAt(i);

            if (ch == s.charAt(i + 1)) {
                ans = true;
            }
        }
        System.out.println(ans);
    }
}
