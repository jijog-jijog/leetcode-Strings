public class palin2 {
    public static void main(String[] args) {
        
        String s = "abca";
        StringBuilder build = new StringBuilder(s);
        
        int i =0;
        int j = s.length()-1;

        boolean ans = true;
    //     while (i < j) {
    //         if (s.charAt(i) == s.charAt(j))  {
    //             i++;
    //             j--;
    //         }else if (s.charAt(i) != s.charAt(j)) {
    //             // s.charAt(j).remove;
    //         }
    //         else {
    //             ans = false;
    //             break;
    //     }
    // }
        System.out.println(build.toString());
    }
}
