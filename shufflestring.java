

public class shufflestring {
    public static void main(String[] args) {
        String s = "codeleet";
        int[] indices = {4,5,6,7,0,2,1,3};
        StringBuilder add = new StringBuilder();

        char[] ans = new char[s.length()];

        for(int i=0; i<s.length(); i++){

            char ch = s.charAt(i);

             ans[indices[i]] = ch;
        }

        System.out.println(new String(ans));
    }
}
