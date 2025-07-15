public class stringcontinous {
    public static void main(String[] args) {
        String s = "1001";

        boolean ans = true;
        for(int i =0; i <  1; i++){

            if (s.charAt(i) != s.charAt(i + 1)) {
                ans = false;
                break;
            }
        }
        System.out.println(ans);
    }
}
